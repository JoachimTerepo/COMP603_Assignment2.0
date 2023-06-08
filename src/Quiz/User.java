package Quiz;

public class User {
    //This Class stores the user information.
    private String firstName;
    private String lastName;
    private int earned;
    
    //Constructor that stores the user information
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.earned = 0;
    }
    
    //Normal get methods.
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEarned() {
        return earned;
    }
    
}
