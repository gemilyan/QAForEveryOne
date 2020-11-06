package HW_8;

    /* Create a function that returns the name of the winner in a fight between two fighters.
       Each fighter takes turns attacking the other and whoever kills the other
       first is victorious. Death is defined as having health <= 0.
       Each fighter will be a Fighter object/instance. See the Fighter
       class below in your chosen language. Both health and damagePerAttack
       will be integers larger than 0. You can mutate the Fighter objects. */

public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if(firstAttacker == fighter1.name){
            while (fighter1.health > 0 && fighter2.health > 0)
            {
                fighter2.health -= fighter1.damagePerAttack;
                fighter1.health -= fighter2.damagePerAttack;
            }
            if (fighter2.health <= 0){return fighter1.name;}
            else return fighter2.name;
        }
        else{
            while (fighter2.health > 0 && fighter1.health > 0)
            {
                fighter1.health -= fighter2.damagePerAttack;
                fighter2.health -= fighter1.damagePerAttack;
            }
            if (fighter1.health <= 0){return fighter2.name;}
            else return fighter1.name;
        }
    }

    public static void main(String[] args) {
        System.out.println(Kata.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
        System.out.println(Kata.declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
        System.out.println(Kata.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        System.out.println(Kata.declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
        System.out.println(Kata.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        System.out.println(Kata.declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }
}