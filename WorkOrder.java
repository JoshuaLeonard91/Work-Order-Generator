package ProjectThree;

/**
 *  The WorkOrder class implements the DataHandler class and is used to create WorkOrder objects
 *  from 2 objects, employee and ticket objects, and gives the creation date of the work order.
 */
public class WorkOrder implements DataHandler {
    //private variables
    private Employee employee;
    private Ticket ticket;
    private String createdAt;

    /**
     *Intilizes the private fields in the class file WorkOrder
     * @param employee takes in an object employee
     * @param ticket takes in an object ticket
     * @param createdAt takes in a string
     */
    public WorkOrder(Employee employee, Ticket ticket, String createdAt) {
        this.employee = employee;
        this.ticket = ticket;
        this.createdAt = createdAt;
    }//end WorkOrder

    /**
     *returns employee object
     * @return employee
     */
    public Employee getEmployee() {
        return employee;
    }//end getEmployee

    /**
     *sets the employee object
     * @param employee takes in a object
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }//end setEmployee

    /**
     *returns the ticket object
     * @return ticket
     */
    public Ticket getTicket() {
        return ticket;
    }//end getTicket

    /**
     *sets the ticket object
     * @param ticket takes in a object
     */
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }//end setTicket

    /**
     *returns the creation date of the work order as a string
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }//end getCreatedAt

    /**
     *sets the creation date for the work order
     * @param createdAt takes in a string
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }//end setCreatedAt

    /**
     *returns a constructed string with date created, employees getInfo, tickets getInfo and the work orders
     * creation date
     * @return String
     */
    @Override
    public String getInfo() {
        return getCreatedAt()+employee.getInfo()+ticket.getInfo()+" Work Order Info: "+"\tCreated at: "+getCreatedAt();
    }//end getInfo

    /**
     *returns the strings from employee getFileData and ticket getFileData info with the date created
     * @return String
     */
    @Override
    public String getFileData() {
        return employee.getFileData()+ticket.getFileData()+getCreatedAt();
    }//end getFileData

}
