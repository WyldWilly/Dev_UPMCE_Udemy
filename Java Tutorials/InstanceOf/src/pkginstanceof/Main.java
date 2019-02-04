
package pkginstanceof;

/* @author costantiniwm */

public class Main {
    
    public static void main(String[] args)
    {
        //instanceof
        // Creates 1 person -> Person person = new Employee("John", "Doe", 125000);
        Person[] people = new Person[4]; // reserves memory for 4 people as null
        people[0] = new Employee("Jake", "Jones", 100000);
        people[1] = new Student("Sally", "Jones");
        
        people[0].getDescription();
        people[1].getDescription();
        
    
    }
}

abstract class Person
{
    Person()
    {
    
    }
    
    Person(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }
    
    String name;
    String surname;
    
    abstract void getDescription();
}

class Employee extends Person
{
    double salary;

    public Employee(String name, String surname, double salary)
    {
        super(name, surname);
        this.salary = salary;
    }
    
    @Override
    void getDescription()
    {
        System.out.println("I am an employee");
        System.out.println("Name: " + this.name + " " + this.surname);
        System.out.println("Salary " + this.salary);

    }
}

class Student extends Person
{

    public Student(String name, String surname)
    {
        super(name, surname);
    }
    
    @Override
    void getDescription()
    {
        System.out.println("I am a student");
        System.out.println("Name: " + this.name + " " + this.surname);
    }
    
}
