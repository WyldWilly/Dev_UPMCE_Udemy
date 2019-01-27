
package staticcontent;

public class StaticContent {


    public static void main(String[] args) {
//        
//        double result = Math.add(5, 165);
//        
//        System.out.println(result);
//        System.out.println();
//        Customer a = new Customer("WMC");
//        Customer b = new Customer("AirC");
//        Customer c = new Customer("WindB");
        
        Customer[] p = new Customer[3];
        p[0] = new Customer("WMC");
        p[1] = new Customer("Arrow");
        p[2] = new Customer("Wind");
        

        System.out.println(p[0].name + " " + p[0].id);
        System.out.println(p[1].name + " " + p[1].id);
        System.out.println(p[2].name + " " + p[2].id);
        System.out.println(Customer.nextId);

    }
    
}

class Math
{
    static double add(double a, double b)
    {
        return a + b;
    }

}

class Customer
{
    Customer(String name)
    {
        this.name = name;
        id = nextId;
        nextId++;
    }
    
    String name;
    int id;
    static int nextId = 1;
}
