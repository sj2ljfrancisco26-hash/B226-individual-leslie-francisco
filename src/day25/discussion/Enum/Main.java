package day25.discussion.Enum;


public class Main {
    public static void main(String[] args) {
    Day today = Day.SATURDAY;
    
    if(today == Day.MONDAY || today == Day.TUESDAY){
        System.out.println("Start of the Week");
    } else if(today == Day.WEDNESDAY || today == Day.THURSDAY){
        System.out.println("It's Midweek");
    } else if(today == Day.FRIDAY){
        System.out.println("Weekend is near");
    } else {
        System.out.println("It's Weekend!");
    }
    }
}
enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
} 
