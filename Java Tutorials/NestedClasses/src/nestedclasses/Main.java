
package nestedclasses;


public class Main {


    public static void main(String[] args)
    {
        A outer = new A();
        
        A.B whatever = outer.new B(); // Works when B is NOT Static
        
        A.C whatever2 = new A.C(); // WHen B is static then this is how it is created.
    }
}

class A // Outer Class
{
    A()
    {
        System.out.println("I am from Outer Class A");

    }
    
    class B // Nested Claas / Inner Class
    //static class B // Nested Claas / Inner Class
    {
        //static double PI = 3.14; // Can only create static variables if the Class is Static
        B()
        {
            System.out.println("I am from Innner Class B");
            tmp = 5; // Cant do this when it is Static
        }
        
        private double sample;
    }     
    
    static class C //nested class
    {
        static double PIc = 3.14;
        
        C()
        {
            
        }
    }
    
    private int tmp;
}
