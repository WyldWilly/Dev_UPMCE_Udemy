
package inheritance;

import monsters.Monster;
import monsters.Skeleton;
import monsters.Zombie;

public class Inheritance {

    public static void main(String[] args) {
        // MONSTERS - ZOMBIES - SKELETONS - hit points, attack, speed
        
//        Monster monster = new Monster(100, 10);
//        
//        monster.attack();
//        System.out.println("Monsters Hit Points are: " + monster.hitPoints);
//        System.out.println("Monsters Speed is: " + monster.speed);
        
        //Skeleton skeleton = new Skeleton();
        //skeleton.attack();

// Used from Sec 9 lesson 43        
//        Skeleton skeleton = new Skeleton(500,500);
//        Skeleton skeleton2 = new Skeleton(1000, 500, "Bow");
//        System.out.println(skeleton.hitPoints);
//        System.out.println(skeleton2.typeOfAttack);
//        skeleton2.attack();
        
// Section 9 lesson 44
        Monster m = new Skeleton();
        Zombie z = new Zombie();
        Skeleton s = new Skeleton(); //poly Morphism
        
        Monster m2 = new Zombie();
        m2 = new Skeleton();
        
        m.attack();
        m.test();
        
        Inheritance.whatever(new Skeleton());

    }
    
    static void whatever(Monster monster)
    {
        
    }
    
}
