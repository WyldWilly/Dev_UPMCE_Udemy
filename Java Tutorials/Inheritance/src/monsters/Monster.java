
package monsters;

/* @author costantiniwm */


public class Monster // Base Class, Super Class or Parent Class
{
    public double hitPoints;
    public double speed;
    
    public void attack()
    {
        /* Here is script that attacks */
        System.out.println("I am attacking from Monster Class Method");
    }
    
    public Monster() // Default
    {
        System.out.println("I am constructor from Monster class DEFAULT");
    }
    
    public Monster(double hitPoints, double speed)
    {
        this.hitPoints = hitPoints;
        this.speed = speed;
        System.out.println("I am constructor from Monster Class with 2 arguments");
    }
}
