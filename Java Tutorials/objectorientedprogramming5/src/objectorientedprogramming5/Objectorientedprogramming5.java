package objectorientedprogramming5;

public class Objectorientedprogramming5 {

    public static void main(String[] args) {
        /*
        Objects - containers that stores variables and functions thematically
                  connected to each other for easier future usage.
        Classes - blueprint for creating instance (copies) of objects
        
        Properties - features (part of something)
        Methods - functions (describes what a function does)

        Overloading Methods
        */        
        Test a = new Test();
        
        a.printSomethingOut("Wm", "Costantini");
        a.printSomethingOut2("Wm", "Costantini");
        a.printSomethingOut3("Wm", "Costantini");
        
        int result = a.add(100, 500);
        System.out.println(result);
        
        double D = a.divide(100, 0);
        System.out.println(D);
        
        System.out.println(a.add(12.41, 12.668));
    }
    
}

class Test
{
    //Properties
   
    //Methods - Inside Class
    //Functions - Outside Class
    void printSomethingOut(String name, String surname)
    {
        System.out.println(name + " " + surname);
    }
    
    void printSomethingOut2(String name, String surname)
    {
        System.out.print("Name: " + name + " ");
        System.out.println(" Surname: " + surname);
    }
    
        void printSomethingOut3(String name, String surname)
    {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
    }
    
    int add(int x, int y)
    {
       return x + y;
    }
    
    //overloaded method
    double add(double x, double y)
    {
        return x + y;
    }
    
    double divide(double x, double y)
    {
        if(y == 0)
            return 0;
        return x / y;
    }
}