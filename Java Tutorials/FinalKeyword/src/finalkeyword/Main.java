
package finalkeyword;

import java.util.Date;



public class Main {

    public static void main(String[] args)
    {
        final double PI = 3.14;
        
        Employee e = new Employee();
        System.out.println(e.dateOfEmployment);
        
    }
    
}

abstract class Person
{


}

class Employee extends Person
{
    Employee()
    {
        this.dateOfEmployment = new Date();
    }
    
    final Date dateOfEmployment;

    Employee(Date date)
    {
        this.dateOfEmployment = date;
    }
    
    Date getDateOfEmployment()
    {
        return dateOfEmployment;
    }
}

class Programmer extends Employee
{
    Date getDateOfEmployment()
    {
        return dateOfEmployment;
    }
}