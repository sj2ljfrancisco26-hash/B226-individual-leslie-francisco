package day22.discussion.Inheritance;

public class Main {
    
    public static void main(String[] args) {
       Admin admin = new Admin("Leslie","Lesliejeff98@gmail.com","Maemae","Admin");
       admin.callAd();
       System.out.println(admin.getInfo());
       System.out.println("Company Name: " + admin.deptName);
       
       System.out.println();
       
       standardUser user = new standardUser("Twixy","Twixy@gmail.com","Les","Standard User");
       user.callSu();
       System.out.println(user.getInfo());
       System.out.println("Company Name: " + user.companyName);
       
        
    }
}
