using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TypeConversion
{
    class Program
    {
        static void Main(string[] args)
        {
            // Example of Type Conversion Byte to Int - Works
            byte b = 1;
            int i = b;
            Console.WriteLine(i);

            // Exampler of Type Conversion Int to Byte works by casting
            int l = 1;
            byte C = (byte) l;
            Console.WriteLine(b);

            // Example of Type Conversion Int to Byte that is too large - Data lost
            int v = 1000;
            byte d = (byte)v;
            Console.WriteLine(d);

            // Example of Non-Compatible Types
            string number = "1234";
            
            // int p = (int) number; wont work not compatible instead
            int p = Convert.ToInt32(number);
            Console.WriteLine(p);
            

            // byte e = Convert.ToByte(number); wont work because byte is not large enough for this int
            // However using Try-Catch you can escape the crash with a message and stop
            try
            {
                var number2 = "5678";
                byte e = Convert.ToByte(number2);
                Console.WriteLine(e);
            }
            catch (Exception)
            {
                Console.WriteLine("This wont work");
            }

            // Example of String to Boolean
            try
            {
                string str = "true";
                bool z = Convert.ToBoolean(str);
                Console.WriteLine(z);
            }
            catch (Exception)
            {
                Console.WriteLine("This didnt work either");
            }
            
        }
    }
}
