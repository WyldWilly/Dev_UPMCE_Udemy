
package bottle;

//import java.util.logging.Level;
//import java.util.logging.Logger;

class NotEnoughWaterException extends Exception{
    public NotEnoughWaterException(String string){
        super(string);
    }
}
        
        
        
public class Bottle {
    private double waterAmount;
    //default Constructor
    Bottle()
    {
        
    }
    
    Bottle(double waterAmount)
    {
        this.waterAmount = waterAmount;
    }

    void fill(double amount)
    {
        this.waterAmount += amount;
    }
    
    //boolean pour(double amount)
    void pour(double amount) throws Exception
    {
        if(this.waterAmount > amount)
            this.waterAmount -= amount;
        else
            throw new Exception("There is not enough water");
//            return false;
//        return true;
    }
    
    double getWaterAmouont()
    {
        return waterAmount;
    }
    
    void transferWater(double amount, Bottle transferToBottle) throws Exception
    {
        //if(this.pour(amount))
        this.pour(amount);
        transferToBottle.fill(amount);
        
//        else
//            System.out.println("Not Enough water");

    }
    
    public static void main(String[] args) {
        /*
            Exceptions
        */
        
        Bottle b = new Bottle(5);
        Bottle b2 = new Bottle(10);
        try{
            b.transferWater(10, b2);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        try
        {
            //System.out.println(5/0);
            int a = 5;
            if (a == 0)
                throw new OurException("That wont work");
        }
        catch(Exception ex)
        {
            System.out.println("This wont run");
            System.out.println(ex.getMessage());
        }
        finally
        {
            System.out.println("so this line will execute always");
        }

        
        /*
            try
            [
                //instructions to try
            ]
            catch(Exception ex)
            {
                //here are instructions in order to makr program work
            }
        
        */
        
        
// Previous Lession
//        Bottle[] bottle = new Bottle[3];
//
//        bottle[0] = new Bottle(10);
//        bottle[1] = new Bottle(5);
//        bottle[2] = new Bottle(1);
//
//        System.out.println("Start with " + bottle[0].getWaterAmouont());
//        bottle[0].fill(5);
//        System.out.println(bottle[0].getWaterAmouont());
//        bottle[0].pour(5);
//        System.out.println(bottle[0].getWaterAmouont());
//
//        System.out.println("Transferring Water");
//        System.out.println("Bottle 0 has " + bottle[0].getWaterAmouont());
//        System.out.println("Bottle 1 has " + bottle[1].getWaterAmouont());
//        bottle[0].transferWater(5, bottle[1]);
//        System.out.println("Transferring now");
//        System.out.println("Bottle 0 has " + bottle[0].getWaterAmouont());
//        System.out.println("Bottle 1 has " + bottle[1].getWaterAmouont());
    }
    
}

class OurException extends Exception
{

    public OurException(String string) {
        super(string);
    }


}
