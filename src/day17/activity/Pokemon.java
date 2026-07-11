package day17.activity;

public class Pokemon {
    String name;
    String type;
    String dAttack;
    String[] ability;
    
    public void pokemonInfo(){
        System.out.println("Name: "+ name + "\n" + "Type: " +type);
    }
    
    public void dodge(){
        System.out.println(name + " used dodge!");
    }
    public void attack(){
        System.out.println(name + " used " + dAttack + "!");  
    }
    public void skill(){
        System.out.println("|==Abilities==|");
        for (int i = 0; i < ability.length; i++) {
            System.out.println((i+1) + ". " + ability[i]);
        }  
    }       
}
