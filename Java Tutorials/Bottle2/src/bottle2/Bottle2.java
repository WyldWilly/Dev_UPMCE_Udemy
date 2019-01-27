
package bottle2;

public class Bottle2 {
    private double waterAmount;
    //default Constructor
    Bottle2()
    {
        
    }
    
    Bottle2(double waterAmount)
    {
        this.waterAmount = waterAmount;
    }

    void fill(double amount)
    {
        this.waterAmount += amount;
    }
    
    boolean pour(double amount)
    {
        if(this.waterAmount > amount)
            this.waterAmount -= amount;
        else
            return false;
        return true;
    }
    
    double getWaterAmouont()
    {
        return waterAmount;
    }
    
    void transferWater(double amount, Bottle transferToBottle)
    {
        if(this.pour(amount))
        {
            transferToBottle.fill(amount);
        }
        else
            System.out.println("Not Enough water");

    }
    
    public static void main(String[] args) {
        
        //Change to For Loop for initialization
        Bottle2[] bottle = new Bottle2[3];
        
        for(i = 0; i < bottle.length; i++)
        {
            int[] size = (10, 5, 1);
            bottle[i] = new Bottle2(size[i];
            
        }
            
            
            bottle[0] = new Bottle(10);
        bottle[1] = new Bottle(5);
        bottle[2] = new Bottle(1);
        
        System.out.println("Start with " + bottle[0].getWaterAmouont());
        bottle[0].fill(5);
        System.out.println(bottle[0].getWaterAmouont());
        bottle[0].pour(5);
        System.out.println(bottle[0].getWaterAmouont());
        
        System.out.println("Transferring Water");
        System.out.println("Bottle 0 has " + bottle[0].getWaterAmouont());
        System.out.println("Bottle 1 has " + bottle[1].getWaterAmouont());
        bottle[0].transferWater(5, bottle[1]);
        System.out.println("Transferring now");
        System.out.println("Bottle 0 has " + bottle[0].getWaterAmouont());
        System.out.println("Bottle 1 has " + bottle[1].getWaterAmouont());
    }
    
}
