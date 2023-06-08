package Quiz;

public class User {
    private String firstName;
    private String lastName;
    private int earned;
    
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.earned = 0;
    }
    
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the earned
     */
    public int getEarned() {
        return earned;
    }
    
}
