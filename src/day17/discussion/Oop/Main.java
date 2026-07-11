package day17.discussion.Oop;

public class Main {
    public static void main(String[] args) {
        Ballpen ballpen1 = new Ballpen();
        ballpen1.brand = "Uni kuru Toga";
        ballpen1.color = "Black";
        ballpen1.pointSize = 2;
        ballpen1.weightIngrams = 0.5;        
        ballpen1.bpenInfo();
        
        System.out.println();
        
        Ballpen ballpen2 = new Ballpen();
        ballpen2.brand = "Pilot Gtech";
        ballpen2.color = "Red";
        ballpen2.pointSize = 2;
        ballpen2.weightIngrams = 0.5;
        ballpen2.bpenInfo();
    }
}
