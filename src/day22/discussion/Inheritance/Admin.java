package day22.discussion.Inheritance;

public class Admin extends User{
    String deptName;
    public Admin(String name, String email, String password, String userRole) {
        super(name, email, password, userRole);
        deptName = "SOH"; 
      
    }
    public void callAd(){
        System.out.println("==This is Admin==");
    }       
}
