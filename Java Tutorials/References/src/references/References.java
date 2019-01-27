
package references;

public class References {

    public static void main(String[] args) {

        /*
            Reference Variable - Class type variables
            Primative Variable - Typical variable
        */
        
        //Primative Variable
        int x = 30;
        int y = x;
        
        y = 10;
        
        System.out.println(x);
        System.out.println(y);
        
        
        Test test = new Test(); // Reference Variable referring to place in memory this is address
        Test test2 = test;
        
        test2.a = 50;
        System.out.println(test.a);
        System.out.println(test2.a);
        
        String name = "WMC";
        String name2 = name;
        
        name2 = "CBA";
        
        System.out.println(name);
        System.out.println(name2);
        
    }
    
}

class Test
{
    //Variables
    int a = 20;
    int b;
    
    
}
