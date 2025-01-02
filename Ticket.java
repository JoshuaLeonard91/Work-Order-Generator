package ProjectThree;

/**
 * The Ticket class implements the DataHandler interface class and takes in
 * 2 Strings and 1 object. The ticket class is used to create the ticket objects with customer
 * information from customer object, the ticket ID and the date the ticket was created at.
 */
public class Ticket implements DataHandler {
    //private variables
    private Customer customer;
    private String createdAt;
    private String ticketId;

    /**
     * Intilizes the private fields in the class file Ticket
     * @param customer takes in a object customer
     * @param ticketId takes in a string
     * @param createdAt takes in a string
     */
    public Ticket(Customer customer, String ticketId, String createdAt) {
        this.customer = customer;
        this.createdAt = createdAt;
        this.ticketId = ticketId;
    }//end Ticket

    /**
     * returns customer object
     * @return customer
     */
    public Customer getCustomer() {
        return customer;
    }//end getCustomer

    /**
     * sets the customer object
     * @param customer takes in a object
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }//end setCustomer

    /**
     * returns the ticket creation date as a string
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }//end getCreatedAt

    /**
     * sets the date the tick was made
     * @param createdAt takes in a string
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }//end setCreatedAt

    /**
     * returns the ticketId as a string
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }//end getTicketId

    /**
     * sets the ticketId
     * @param ticketId takes in a string
     */
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }//end setTicketId

    /**
     * returns a constructed string with customersInfo from the customer class, the getTicketId and getCreatedAt
     * @return String
     */
    @Override
    public String getInfo() {
        return customer.getInfo()+"\tCreated At: "+getCreatedAt()+"\tTicket Id: "+getTicketId();
    }//end getInfo

    /**
     * returns a comma seperated string with customers getFileData from customer class, getTicketId and getCreatedAt
     * @return String
     */
    @Override
    public String getFileData() {
        return customer.getFileData()+getTicketId()+","+getCreatedAt()+",";
    }//end getFileData
}
