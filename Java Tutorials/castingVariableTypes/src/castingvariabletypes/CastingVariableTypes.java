
package castingvariabletypes;


public class CastingVariableTypes {


    public static void main(String[] args) {
        int a = 5, b = 2;
        double c = 12, d = 15;
        
        System.out.println("This is an Int " + (a/b));
        System.out.println("This is a Double " + (d / c));
        
        System.out.println("This is an Int cast to Double " + ((double)(a/b)));
        System.out.println("This is a Double cast to an Int " + ((int)(d / c)));
        
    }
    
}
