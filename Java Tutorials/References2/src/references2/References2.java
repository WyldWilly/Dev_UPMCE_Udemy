package references2;
// Passing References and Primatives thru Methods

public class References2 {

    public static void main(String[] args) {

        /*
            Reference Variable - Class type variables
            Primative Variable - Typical variable
        */
        
        int a = 10;
        
        Test test = new Test();
        
        test.changevalue(a);

        //a = test.changevalue(a);
        
        System.out.println(a);
        
        Foo foo = new Foo();
        System.out.println(foo.x);
        test.changFoo(foo); // ADDRESS
        System.out.println(foo.x);
    }
}

class Test
{
    // int changevalue(int var)
    void changevalue(int var)
    {
        var = var + 5;
        //return var;
    }
    
    void changFoo(Foo var) // Foo var = ADDRESS
    {
        var.x = var.x + 15;
    }
}

class Foo
{
    int x = 10;

}
