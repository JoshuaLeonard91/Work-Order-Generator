package ProjectThree;

/**
 * The Employee class is an extension of the person class , it also implements
 * the dataHandler class. The employee class file takes in 3 separate string fields as well
 * as the extended string fields from the person class.
 */

public class Employee extends Person implements DataHandler {
    //private variables

    private String employeeId;
    private String clockedIn;
    private String hiredDate;

    /**
     * Intilizes the private fields in the class file Employee
     * @param employeeId takes in the employee id string
     * @param firstName takes in the first name of the employee as a string
     * @param lastName takes in the last name of the employee as a string
     * @param email takes in the email of the employee as a string
     * @param address takes in the living address of the employee as a string
     * @param phoneNumber takes in the phone number of the employee as a string
     * @param clockedIn takes in the time employee clocked in as a string
     * @param hiredDate takes in the hired date of the employee as a string
     */
    public Employee(String employeeId, String firstName, String lastName, String email, String address, String phoneNumber,
                    String clockedIn, String hiredDate) {
        super(firstName, lastName, address, phoneNumber, email);
        this.employeeId = employeeId;
        this.clockedIn = clockedIn;
        this.hiredDate = hiredDate;
    }//end Employee

    /**
     * returns employee ID as a string
     * @return employeeId
     */
    public String getEmployeeId() {
        return employeeId;
    }//end getEmployeeId

    /**
     * sets the employee ID
     * @param employeeId takes in the employee id string
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }//end setEmployeeId

    /**
     * returns the time employee clocks in as a string
     * @return clockedIn
     */
    public String getClockedIn() {
        return clockedIn;
    }//end getClockedIn

    /**
     * sets the time an employee clocks in
     * @param clockedIn takes in the time employee clocked in
     */
    public void setClockedIn(String clockedIn) {
        this.clockedIn = clockedIn;
    }//end setClockedIn

    /**
     * returns the employees hired date
     * @return hiredDate
     */
    public String getHiredDate() {
        return hiredDate;
    }//end getHiredDate

    /**
     * sets the employee hire date
     * @param hiredDate takes in the hired date string
     */
    public void setHiredDate(String hiredDate) {
        this.hiredDate = hiredDate;
    }//end setHiredDate

    /**
     * calls getFirstName, getLaseName and getEmployeeId methods and returns
     * as a constructed string
     * @return String
     */
    @Override
    public String getInfo() {
        return ": Employee Info: "+"Employee Name: "+getFirstName()+","+getLastName()+"\t"+"Employee ID: "+getEmployeeId()+
                "\tTime Clocked In: "+getClockedIn();
    }//end getInfo

    /**
     * calls getEmployeeId, getFirstName, getLastName and getClockedIn methods and
     * returns as a string with each field seperated by a comma
     * @return String
     */
    @Override
    public String getFileData() {
        return getEmployeeId()+","+getFirstName()+","+getLastName()+","+getClockedIn()+",";
    }//end getFileData
}
