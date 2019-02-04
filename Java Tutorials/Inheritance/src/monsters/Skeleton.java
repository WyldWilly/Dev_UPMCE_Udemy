
package monsters;

/* @author costantiniwm */


public class Skeleton extends Monster // Derived Class, Sub Class or Child Class of Monster
{
    public String typeOfAttack;
    
    
    @Override
    // Overloading would mean public void attack(String typeOfAttack)
    public void attack()
    {
        super.attack();
        System.out.println("I am attack method from Skeleton class ");
    }    
    
    public Skeleton()
    {
        System.out.println("I am constructor from Skeleton class DEFAULT");
    }
    
    public Skeleton(double hitPoints, double speed)
    {
        /* This is not a good idea because you are repeating the stuff from the Parent
            this.hitPoints = hitPoints;
            this.speed = speed;
            instead use Super(); */
        super(hitPoints, speed); // must be first line in constructor
        System.out.println("I am constructor from Skeleton class with 2 arguments");
        typeOfAttack = "Axe";

    }
    
    public Skeleton(double hitPoints, double speed, String typeOfAttack)
    {
        super(hitPoints, speed);
        System.out.println("I'm constructor from Skeleton class with 3 arguments");
        this.typeOfAttack = typeOfAttack;
        
    }

    @Override
    protected void description() {

    }
}
