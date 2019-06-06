
package whatareinterfaces;

public class Main {

    public static void main(String[] args)
    {
        nameOfInterface a = new Employee(1000);
        Object b = new Employee(5000);
        a.sample();
        ((Employee)a).getSalary();
        
        System.out.println(nameOfInterface.PI);
    }
    
}

interface nameOfInterface
{
    double PI = 3.14; //public final static
    
    void sample(); // public abstract
    
    
}   // implement - similar to extend but takes the behavors.

interface someOtherInterface
{

}

class Employee implements nameOfInterface, someOtherInterface
{
    public Employee(double salary)
    {
        this.salary = salary;
    }
            
    @Override
    public void sample() {
        
    }
    
    private double salary;
    double getSalary()
    {
        return this.salary;
    }
}

class A
{}


class Programmer extends Employee
{
    public Programmer(double salary)
    {
        super(salary);
    }
}