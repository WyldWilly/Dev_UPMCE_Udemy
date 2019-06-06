<<<<<<< HEAD
package generictype;

//Generic Type
//Wild Card
=======

package generictype;
>>>>>>> 06781daf18773ec3b5b5a0bcb87078388d2e9dcc

import java.util.ArrayList;

public class GenericType {

    public static void main(String[] args) {
<<<<<<< HEAD
        String name = "Arek"; // raw type
        String name2 = "Viola";
        
        ArrayList<String> n = new ArrayList<String>();
        // ArrayList<String> n = new ArrayList<>(); Also correct
        n.add(name);
        n.add(name2);
        // Unable to use the 2 below because of the <String> above. Also dont need to downcast
        //n.add(new Object());
        //n.add(new Employee());
        
        String firstName = n.get(0);
        String lastName =  n.get(1);
        //String anotherName =  (String) n.get(3);
        
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);
        
        Box<String> box = new Box<>();
        box.setElement("Arkadish");
        System.out.println("MyBox: " + box.nameOfElement());
        
        
=======
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
>>>>>>> 06781daf18773ec3b5b5a0bcb87078388d2e9dcc
    }
    
}

class Employee
{
    
}

<<<<<<< HEAD
class Box<T>
{
    T element;
    
    void setElement(T valueOfElement)
    {
        this.element = valueOfElement;
    }
    
    T nameOfElement()
    {
        return this.element;
    }
}
=======
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
>>>>>>> 06781daf18773ec3b5b5a0bcb87078388d2e9dcc
