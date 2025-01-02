package ProjectThree;

/**
 * getInfo() method nad getFileData method are implemented in 4 classes, the Employee Class, the Customer Class
 * then Ticket Class and WorkOrder Class. Each of the 4 classes contains its own constructed return string
 * OR calls on the one of the 4 classes to return that string and add to it.
 */
public interface DataHandler{

    public String getInfo();

    public String getFileData();
}
