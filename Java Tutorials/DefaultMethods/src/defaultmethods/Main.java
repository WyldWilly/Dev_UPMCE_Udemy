
package defaultmethods;


public class Main {

    public static void main(String[] args)
    {
        Formula f = (int a) -> {
            return 5;
        };

    }
    
}

interface Formula
{
    double calculate(int a);    // public abstract
    default double sqrt(int a)  // not abstract
    {
        return Math.sqrt(a);
    }
            
}

class A implements Formula
{
    @Override
    public double calculate(int a)
    {
        return 0;
    }
}