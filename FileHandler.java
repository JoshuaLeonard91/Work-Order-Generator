package ProjectThree;

import java.io.*;
import java.util.Scanner;
import java.io.File;

/**
 * The FileHandler class has 2 methods that handle creating the logs.txt file and the output file for the WorkOrders and
 * two methods that each read a file one for the employees and one for the tickets and adds the new objects into the
 * array lists in Project3 class. Each method has a try/catch.
 */
public class FileHandler{
    //private variables
    private static Scanner fileScanner;
    /**
     * The logger method takes in a string and will output that string into a file called "log.txt"
     * formatted with a creation date followed the String it has taken in, the writer is set to append
     * to the log file and not overwrite the file
     * @param log String
     * @Throws custom IOException and custom Exception
     */
    public static void logger(String log) {

        BufferedWriter writer = null;
        try
        {
            writer = new BufferedWriter(new FileWriter("log.txt", true));
            writer.write(Project3.createDate()+": "+log+"\n");

        } catch (IOException e) {
            System.out.println("*Error writing to log file*"+" "+e.getMessage());
        }finally
        {
            try {
                writer.close();
            } catch (IOException e) {
                System.out.println("*Error writing to log file*"+" "+"("+e.getMessage()+")");
            }
        }

    }//end logger

    /**
     * The readEmployee method takes in a String when called that contains a file location,
     * the file is read with a delimiter "comma". It scans each string that is seperated by a comma and
     * adds to the employee object which is then added to the employee list.
     * @param employeeData String
     * @Throws custom FileNotFound and a custom Exception.
     */
    public static void readEmployeeData(String employeeData){

        fileScanner = null;
        try
        {
            fileScanner = new Scanner(new File(employeeData));
            Employee newEmployee;

            fileScanner.useDelimiter(",|\n");
            fileScanner.nextLine();
            //scans the file and adds each delimited text to the appropriate category
            while (fileScanner.hasNext()) {
                newEmployee = new Employee(fileScanner.next(),fileScanner.next(),fileScanner.next(),
                        fileScanner.next(),fileScanner.next(),fileScanner.next(),fileScanner.next(),fileScanner.next());
                Project3.employeeList.add(newEmployee);
            }
        } catch (FileNotFoundException e) {
            System.out.println("*File not found*"+e.getMessage());
            logger("*File not found*"+e.getMessage());
        }finally
        {
            try {
                fileScanner.close();
            } catch (Exception e) {
                System.out.println("*No data to write to file*"+" "+"("+e.getMessage()+")");
                logger("*No data to write to file*"+" "+"("+e.getMessage()+")");
            }
        }
    }//end readEmployeeData

    /**
     * The readTicket method takes in a String when called that contains a file location,
     * the file is read with a delimiter "comma". It scans each string that is seperated by a comma and creates
     * a newCustomer object and creates a newTicket object. The customer object is then applied to the newTicket object
     * along with the ticket ID and creation date.
     * @param ticketData String
     * @Throws custom FileNotFound and custom exceptions.
     */
    public static void readTicketData(String ticketData) {

        fileScanner = null;
        try
        {
            fileScanner = new Scanner(new File(ticketData));
            Customer newCustomer;
            Ticket newTicket;

            fileScanner.useDelimiter(",|\n");
            fileScanner.nextLine();
            //scans the file and adds each delimited text to the appropriate category
            while (fileScanner.hasNext()) {
                newCustomer = new Customer(fileScanner.next(),fileScanner.next(),fileScanner.next(),fileScanner.next(),
                        fileScanner.next(),fileScanner.next(),fileScanner.next());
                //using trim() method to remove the newline issues in the file.
                newTicket = new Ticket(newCustomer,fileScanner.next(),fileScanner.next().trim());
                Project3.ticketList.add(newTicket);
            }
        } catch (FileNotFoundException e) {
            System.out.println("*File not found*"+e.getMessage());
            logger("*File not found*"+e.getMessage());
        }finally
        {
            try
            {
                fileScanner.close();
            }catch(Exception e){
                System.out.println("*No data to write to file*"+" "+"("+e.getMessage()+")");
                logger("*No data to write to file*"+" "+"("+e.getMessage()+")");
            }
        }
    }//end readTicketData

    /**
     * The method takes in a string and writes to one file called "work_order.csv",
     * the logger method is called to write the data from getInfo() methods to the
     * "log.text" file which is set to append. The output file is not set to append.
     * @Throws custom IOException
     */
    public static void writeWorkOrder(String outputFile) {
        BufferedWriter csvWriter = null;

        try {
            csvWriter = new BufferedWriter(new FileWriter(outputFile, false));
            String header = "employee_id,employee_first_name,employee_last_name,clocked_in,customer_id,customer_first_name," +
                        "customer_last_name,ticket_id,ticket_createdAt,workorder_createdAt\n";
            csvWriter.write(header);
            for (WorkOrder workOrder : Project3.workOrderList) {
                logger(workOrder.getInfo());
                csvWriter.write(workOrder.getFileData()+"\n");
            }
            } catch (IOException e) {
                System.out.println("*Error writing work order to csv file*" + e.getMessage());
                logger("*Error writing work order to csv file*" + e.getMessage());
            } finally {
                try
                {
                    if (csvWriter != null) {
                        csvWriter.close();
                    }
                }catch(IOException e)
                {
                    System.out.println("*Error closing file*" + e.getMessage());
                    logger("*Error closing file*" + e.getMessage());
                }
            }
        }//end writeWorkOrder

}