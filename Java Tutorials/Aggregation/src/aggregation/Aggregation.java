
package aggregation;


public class Aggregation {


    public static void main(String[] args)
    {
        Employee e = new Employee("Tom",new Address("MetaWay", 655, "Pittsburgh", "US"));
        System.out.println(e);
    }
    
}

class Employee
{
    String name;
    Address address; // Aggregation
    Job job;         // Composition

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name + ": " + address.streetNumber + " " + address.streetName + " " + address.city  + " " + address.country;
    }
    
    
}