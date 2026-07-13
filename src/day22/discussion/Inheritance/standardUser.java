
package day22.discussion.Inheritance;

public class standardUser extends User {
    String companyName;
    public standardUser(String name, String email, String password, String userRole) {
        super(name, email, password, userRole);
        companyName = "SHAP";
    }
    public void callSu(){
        System.out.println("==This is Standar User==");
    }  
}