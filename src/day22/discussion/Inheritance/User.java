package day22.discussion.Inheritance;


public class User{
    String id;
    String name;
    String email;
    String password;
    String userRole;

    public User(String name, String email, String password, String userRole) {     
        this.name = name;
        this.email = email;
        this.password = password;
        this.userRole = userRole;
    }

    public String getInfo(){
    return "User: " + name + "\nEmail: " + email + "\npassword: " + password + "\nUser Role: " + userRole;
    
    }
}


