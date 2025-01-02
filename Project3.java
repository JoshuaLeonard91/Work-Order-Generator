/*
* Author: Joshua Leonard
* Course: COP3503
* Project #: 3
* Title: Project 3 Work Order Generator
* Due Date: 07/22/2022 (extended to 07/24/2022)
*
* Program reads two separate csv files and loads the contents of each file
* into an Employee object, Customer Object or Ticket object, the data is then
* output into a work_order.csv file and a log.txt file that is correctly formatted.
*/

package ProjectThree;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Project3 {
    //array list to hold objects
    public static ArrayList<Employee> employeeList = new ArrayList<>();
    public static ArrayList<Ticket> ticketList = new ArrayList<>();
    public static ArrayList<WorkOrder> workOrderList = new ArrayList<>();
    //file names
    public static String employeeData = "employee_data.csv";
    public static String customerData = "ticket_data.csv";
    public static String workOrderFile = "workorder_data.csv";


    public static void main(String[] args) {

        //project name
        System.out.print("Project 3 Work Order Generator\n\n");

        System.out.println("Loading Employee Data");
        FileHandler.logger("Loading Employee Data");
        FileHandler.readEmployeeData(employeeData);
        System.out.println("Loading Ticket Data");
        FileHandler.logger("Loading Ticket Data");
        FileHandler.readTicketData(customerData);
        System.out.println("Creating Work Orders");
        FileHandler.logger("Creating Work Orders");
        createWorkOrder();
        System.out.println("Writing Work Order Data to File");
        FileHandler.logger("Writing Work Order Data to File");
        FileHandler.writeWorkOrder(workOrderFile);
        System.out.println("Work Orders Created. Program Exiting");
        FileHandler.logger("Work Orders Created. Program Exiting");

    }//end main

    /**
     * The createWorkOrder() returns nothing and creates
     * work orders from the employee object, ticket lists and
     * calls the createDate() method for the creation time of the work order
     *
     */
    public static void createWorkOrder(){
        //variables
        WorkOrder newOrder;
        int count = 0;
        int j = 0;

        //loop to create workOrder objects, assigns 10 to each employee
        //if count is not less than 10 it will move to the next employee
        for (Employee employee : employeeList) {
            for (; j < ticketList.size(); ++j) {
                if (count < 10) {
                    newOrder = new WorkOrder(employee, ticketList.get(j), createDate());
                    workOrderList.add(newOrder);
                    ++count;
                } else {
                    count = 0;
                    break;
                }
            }
        }
    }//end createWorkOrder

    /**
     * The createDate method returns a string containing a formatted date
     * ex. "07/15/2022 8:48:30".
     * @return dateCreated
     */
    public static String createDate(){
        //variables
        String dateCreated;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = new Date();

        dateCreated = dateFormat.format(date);

        return dateCreated;
    }//end createDate
}
