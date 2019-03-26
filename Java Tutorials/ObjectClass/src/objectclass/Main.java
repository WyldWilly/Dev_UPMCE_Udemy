
package objectclass;


public class Main {

    public static void main(String[] args)
    {
//        Point p = new Point(1, 10); // Address
//        Point p2 = new Point(1, 5); // New Address
//        ;System.out.println(p.getClass());
//        if (p.equals(p2))
//            System.out.println("They are equal");
       Object[] p = new Point[7];
       p[0] = new Point(4, 55);
       p[1] = new Point(2, 55);
       p[2] = new Point(4, 2);
       p[3] = new Point(12, 55);
       
        //System.out.println(p[0].equals(p[1]));
        //System.out.println(p[0]);
        for (int i = 0; i < p.length; i++)
        {
            if (p[i] instanceof Point)
            System.out.println(p[i]);
        }
    }
    
}

class Point
{
    private int x;
    private int y;
    
    Point(){ }
    Point (int x, int y)
    {
        this.x = x;
        this.y = y;    
    }
    
    int getX()
    {
        return x;
    }
    
    int getY()
    {
        return y;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (this.getClass() != o.getClass())
            return false;
        Point sentPoint = (Point)o;
        return this.x == sentPoint.x && this.y == sentPoint.y;
    }
    @Override
    public String toString()
    {
        //return "Whatever";
        return getX() + " " + getY();
    }
    
}