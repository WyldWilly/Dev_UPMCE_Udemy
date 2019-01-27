package bonusscanner;

import java.util.Scanner;

public class BonusScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  //Defines the input object
        
        System.out.println("Please enter your name: "); //User message
        String name = input.next();                     // Get string value
        System.out.println("Your name is: " + name);
        
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Yout age is: " + age);
        
        System.out.println("Please enter your salary: ");
        double salary = input.nextDouble();
        System.out.println("Your salary is: " + salary);
    }
    
}
