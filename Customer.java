package ProjectThree;

/**
 * The Customer class is an extension of the person class , it also implements
 * the dataHandler class. The Customer class takes in 2 separate string fields
 * as well as the extended strings from the person class. The customer class is used
 * to create customer objects.
 */

public class Customer extends Person implements DataHandler{
    //private variables
    private String customerId;
    private String accountNumber;

    /**
     * Intilizes the private fields in the class file Customer
     * @param customerId customers ID
     * @param firstName customers first name
     * @param lastName customers last name
     * @param email customers email address
     * @param address customers address
     * @param phoneNumber customers phone number
     * @param accountNumber customers account number
     */
    public Customer(String customerId, String firstName, String lastName, String email, String address, String phoneNumber,
                    String accountNumber) {
        super(firstName, lastName, address, phoneNumber, email);
        this.customerId = customerId;
        this.accountNumber = accountNumber;
    }//end Customer

    /**
     * returns customers ID as a string
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }//end getCustomerId

    /**
     * sets the customer ID
     * @param customerId takes in a string
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }//end setCustomerId

    /**
     * returns account number as a string
     * @return accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }//end getAccountNumber

    /**
     * sets the account number
     * @param accountNumber takes in a string
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }//end setAccountNumber

    /**
     * returns a constructed string with getLastName, getFirstName, getCustomerId and get account number
     * @return String
     */
    @Override
    public String getInfo() {
        return "\tCustomer Info: "+"Customer Name: "+getLastName()+","+getFirstName()+"\tCustomer ID: "+getCustomerId()+"\tAccount Number: "+getAccountNumber();
    }//end getInfo

    /**
     * returns a comma seperated string with getCustomerId, getFirstName and getLastName
     * @return String
     */
    @Override
    public String getFileData() {
        return getCustomerId()+","+getFirstName()+","+getLastName()+",";
    }//end getFileData
}
