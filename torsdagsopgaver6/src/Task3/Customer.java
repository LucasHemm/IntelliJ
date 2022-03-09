package Task3;

public class Customer {

    private String firstName;
    private String lastName;
    private String username;
    int id;

    public Customer(String firstName, String lastName, String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    @Override
    public String toString(){
        return "User " + username + " fullname is " + firstName + " " + lastName;
    }

}
