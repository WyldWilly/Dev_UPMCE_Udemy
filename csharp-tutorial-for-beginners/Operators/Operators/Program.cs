using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Operators
{
    class Program
    {
        static void Main(string[] args)
        {
            // Examples of Pre and Post fix changes
            int z = 1;
            int x = 1;
            Console.WriteLine("Value of z: " + z);
            Console.WriteLine("Value of x: " + x);
            int cs = z++;
            Console.WriteLine("Value of cs: " + cs + " Value of z: " + z);
            int ds = ++z;
            Console.WriteLine("Value of ds: " + ds + " Value of z: " + z);

            // Examples of Assignment Operators
            int ao1 = 1;
            Console.WriteLine(ao1);
            ao1 += 3;
            Console.WriteLine(ao1);
            ao1 -= 3;
            Console.WriteLine(ao1);
            ao1 *= 3;
            Console.WriteLine(ao1);
            ao1 /= 3;
            Console.WriteLine(ao1);

            // Instructor Examples

            var a = 10;
            var b = 3;
            var c = 3;
            var d = 1;
            var e = 2;

            Console.WriteLine(a + b);
            Console.WriteLine((float)a / (float)b);
            Console.WriteLine(a - b);
            Console.WriteLine(a * b);
            Console.WriteLine(d + e * c); // Example of precedence
            Console.WriteLine((d + e) * c); // Example of precedence altered by ()


            // Comparison Operators
            var s = 1;
            var t = 2;
            var u = 3;

            Console.WriteLine(s > t);
            Console.WriteLine(s == t);
            Console.WriteLine(s < t);
            Console.WriteLine(s != t);
            Console.WriteLine(!(a != b));
            Console.WriteLine(u > t);

            Console.WriteLine(u > t && u > s);
            Console.WriteLine(u > t && u == s);
            Console.WriteLine(u > t || u == s);
            Console.WriteLine(!(u > t && u == s));
        }
    }
}
