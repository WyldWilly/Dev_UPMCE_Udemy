
package generictypewildcard;

//Wild Card
class ProcessingBoxes
{
    static void processBox(Box<?> box) // ? is the wild card that allows for various types to be used.
    //static void processBox(Box<? extends Object> box) <- this is the same as above.
    {
        
    }
}   


public class GenericTypeWildCard {

    public static void main(String[] args) {

        Box<String> boxOfStrings = new Box<>();
        Box<Employee> boxOfEmployees = new Box<>();
        Box<SuperEmployee> boxOfSuperEmployees = new Box<>();
        Box<Object> boxOfObjects = new Box<>();
        
        ProcessingBoxes.processBox(boxOfStrings);
        ProcessingBoxes.processBox(boxOfEmployees);
        ProcessingBoxes.processBox(boxOfSuperEmployees);
        ProcessingBoxes.processBox(boxOfObjects);
        
    }
    
}

class SuperEmployee extends Employee
{
    
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
    
    T getElement()
    {
        return this.element;
    }
}