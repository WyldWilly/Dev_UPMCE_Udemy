package objectorientedprogramming;

public class Objectorientedprogramming {

    public static void main(String[] args) {
        /*
        Objects - containers that stores variables and functions thematically
                  connected to each other for easier future usage.
        Classes - blueprint for creating instance (copies) of objects
        
        Properties - features (part of something)
        Methods - functions (
        */
        Monitor monitor1 = new Monitor();
        Monitor monitor2 = new Monitor();
        
        monitor1.width = 1000;
        monitor2.width = 20000;
        
        // Prints out the width using SOUT
        System.out.println("monitor1 width is " + monitor1.width);
        
        // Prints out width using function in class/object
        monitor1.getWidth();
        monitor2.getWidth();
        
        
    }
    
}

class Monitor
{
    //Properties
    int width;
    int height;
    int brightness;
    
    //Functions
    void changeBrightness()
    {
        /*
            Place for instructions to be done
        */
    }
    
    void getWidth()
    {
        System.out.println(width);
    }
    
}
