
package generictype;

import java.util.ArrayList;

public class GenericType {

    public static void main(String[] args) {
        String name = "Arek"; // Raw Type
        String name2 = "Viola";
        
        // Generic Type - placeholder for variable that may need to be decided upon for type later
        
        ArrayList<String> n = new ArrayList<String>(); // ArrayList is a collection item. Adding in <> imposes a type to it.
        // ArrayList<String> n = new ArrayList<>(); will also work
        
        
        n.add(name);
        n.add(name2);
        
        
        String firstName = n.get(0);
        String OtherName = n.get(1);
        
        System.out.println("FirstName: " + firstName);
        System.out.println("Othername: " + OtherName);
        
        Box<String> box = new Box<>();
        box.setnameOfVariable("Harry");
        System.out.println(box.getnameOfVariable());
    }
    
}

class Employee
{
    
}

class Box<T> // Using the <> you can put a placeholder for the type
{
        T nameOfVariable;
        
        void setnameOfVariable(T valueOfVariable)
        {
            this.nameOfVariable = valueOfVariable;
        }
        
        T getnameOfVariable()
        {
            return this.nameOfVariable;
        }
}
