
package bottle2;

//Import
import java.util.Scanner;

public class Bottle2 {
    private double waterAmount;
    private double bVolume;
    private int whichBottle;
    
    //default Constructor
    Bottle2()
    {
        
    }
    
    Bottle2(double bVolume, double waterAmount)
    {
        this.bVolume = bVolume;
        this.waterAmount = waterAmount;
    }
    
    
    // Methods
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
    
    void transferWater(double amount, Bottle2 transferToBottle)
    {
        if(this.pour(amount))
        {
            transferToBottle.fill(amount);
        }
        else
            System.out.println("Not Enough water");

    }
    
    void checkVolume(double addAmount, int selectBottle)
    {
        // What amount is going in
            // What amount - Send addAmoount
            // Which Bottle - Send the Bottle
        this.waterAmount = addAmount;
        this.whichBottle = selectBottle;
        
        // What is the Total Volume
        
        // What is the current amount
        int A = bottle[whichBottle].getWaterAmouont();
        
        // Decide
    
    }
    
    
    // Main
    public static void main(String[] args) {
        
        //Change to For Loop for initialization
        Bottle2[] bottle = new Bottle2[3];
        
        int[] Volume = new int[3];
            Volume[0] = 10;
            Volume[1] = 5;
            Volume[2] = 1;
         
        for(int i = 0; i < bottle.length; i++)
        {
           bottle[i] = new Bottle2(Volume[i], Volume[i]);
        }
            
        
        for(int k = 0; k < bottle.length; k++)
        {
            System.out.println("Bottle" + k + " holds " + bottle[k].bVolume + " and has " + bottle[k].getWaterAmouont());
        }
        
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

          // Adding and using new Method
          Scanner input = new Scanner(System.in);
          System.out.println("Please enter your age: ");
          int addAmount = input.nextInt();
          System.out.println("Which Bottle /(0/, 1/, 2/)");
          int selectBottle = input.nextInt();
    }
    
}

/*
And now I'd like you to train a bit more.
I like to create here another property dad will represent the mind the capacity of bottle right because
right now we can put as much water as we want into bottle.
And I would like you to you know check in the film that he we didn't exceed the capacity and I would
like to also you know but it we're in the same time I get here right.
That's why we are using these methods here so we don't need to check two times condition here and here
the same conditions.
*/