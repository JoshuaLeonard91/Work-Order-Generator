package ProjectThree;

/**
 * Person class file is abstract so a person object cannot be created
 * it is the main blueprint that extends to the employee and customer classes,
 * it takes in 5 strings, firstName, lastName, address, phoneNumber and email.
 */

public abstract class Person {
    //private variables
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;

    /**
     * Intilizes the private fields in the class file Person
     * @param firstName String
     * @param lastName String
     * @param address String
     * @param phoneNumber String
     * @param email String
     */
    public Person(String firstName,String lastName,String address,String phoneNumber,String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }//end person

    /**
     * returns the persons first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }//end getFirstName

    /**
     * set the persons first name
     * @param firstName String
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//end setFirstName

    /**
     * returns the persons last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }//end getLastName

    /**
     * sets the last name
     * @param lastName String
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//end setLastName

    /**
     * returns the persons living address
     * @return address
     */
    public String getAddress() {
        return address;
    }//end getAddress

    /**
     * sets the persons living address
     * @param address String
     */
    public void setAddress(String address) {
        this.address = address;
    }//end setAddress

    /**
     * returns the persons phone number
     * @return phone number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }//end getPhoneNumber

    /**
     * set the phone number
     * @param phoneNumber String
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }//end setPhoneNumber

    /**
     * returns the persons email address
     * @return email
     */
    public String getEmail() {
        return email;
    }//end getEmail

    /**
     * sets the persons email address
     * @param email String
     */
    public void setEmail(String email) {
        this.email = email;
    }//end setEmail


}
