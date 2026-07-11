package day17.activity;

public class main {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon();
        pokemon1.name = "Bulbasaur";
        pokemon1.type = "Grass";
        pokemon1.dAttack = "Tackle";
        pokemon1.ability = new String[]{"Vine Whip","Power Whip","Sludge Bomb","Seed Bomb"};
        pokemon1.pokemonInfo();
        pokemon1.skill();
        pokemon1.attack();
        pokemon1.dodge();
        
        System.out.println();
        
        Pokemon pokemon2 = new Pokemon();
        pokemon2.name = "Pichu";
        pokemon2.type = "Electric";
        pokemon2.dAttack = "Tail Whip";
        pokemon2.ability = new String[]{"Thunder Shock","Thunder Punch","Disarming Voice"};
        pokemon2.pokemonInfo();
        pokemon2.skill();
        pokemon2.attack();
        pokemon2.dodge();     
    }
}
