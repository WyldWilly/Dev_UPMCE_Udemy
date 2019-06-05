package generictype;

//Generic Type
//Wild Card

import java.util.ArrayList;

public class GenericType {

    public static void main(String[] args) {
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
        
        
    }
    
}

class Employee
{
    
}

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