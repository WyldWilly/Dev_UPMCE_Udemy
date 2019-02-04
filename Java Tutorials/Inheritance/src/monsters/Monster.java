
package monsters;

/* @author costantiniwm */


public abstract class Monster // Base Class, Super Class or Parent Class
{
    private double hitPoints;
    private double speed;
    
    protected double getHitPoints()
    {
        return hitPoints;
    }
    
    protected void setHitPoints(double hitPoints)
    {
        this.hitPoints = hitPoints;
    }
    
    protected double getSpeed()
    {
        return speed;
    }
    
    public void attack()
    {
        /* Here is script that attacks */
        System.out.println("I am attacking from Monster Class Method");
    }
    
    abstract protected void description();
    
    public void test()
    {
        System.out.println("BAM!!");
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
