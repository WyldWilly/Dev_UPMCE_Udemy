package objectorientedprogramming2;

public class Objectorientedprogramming2 {

    public static void main(String[] args) {
        /*
        Objects - containers that stores variables and functions thematically
                  connected to each other for easier future usage.
        Classes - blueprint for creating instance (copies) of objects
        
        Properties - features (part of something)
        Methods - functions (describes what a function does)
        
        Constructors
        */

        Point p = new Point(10, 20);  // invokes the default constructor
        Point p2 = new Point(4, 25);
        Point p3 = new Point();
        
        // p.x = 10;
        // p.y =20;
        
        System.out.println(p.x);
        System.out.println(p.y);
        System.out.println(p2.x);
        System.out.println(p2.y);
        System.out.println(p3.x);
        System.out.println(p3.y);
    }
    
}

class Point
{
    //creating default constructor in class
    Point()
    {
        System.out.println("This is the default constructor");
        x = 100;
        y = 100;
    }
    
    // creating constructor that takes parameters
    Point(int first, int second)
    {
        x = first;
        y = second;
    }
    
    //Properties
    int x;
    int y;
}