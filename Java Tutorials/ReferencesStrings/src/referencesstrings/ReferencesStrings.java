package referencesstrings;

public class ReferencesStrings {

    public static void main(String[] args) {
        // This is an exercise on comparing strings properly
        
        // Using == 
        String name = "Apollo"; // Literal
        String name2 = "Apollo";
        
        System.out.println("Using == for comparison");
        System.out.println("Case 1 Literal Comparison");
        if (name == name2)  //Works is exactly the same content and case
            System.out.println("They are equal");
        else
            System.out.println("The are not equal");
        
        String nameA = new String("Apollo"); 
        String nameB = new String("Apollo");
        System.out.println("Case 2A Address comparison");
        if (nameA == nameB)  //Works is exactly the same content and case
            System.out.println("They are equal");
        else
            System.out.println("The are not equal");
        
        // Using equals method
        System.out.println("Case 2B \"equals\" comparison");
        if (nameA.equals(nameB))  //Works is exactly the same content and case
            System.out.println("They are equal");
        else
            System.out.println("The are not equal");



    }
    
}
