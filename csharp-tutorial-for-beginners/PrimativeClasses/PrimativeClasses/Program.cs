using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrimativeClasses
{
    public class Person
    {
        public string Name;

        public void Introduce()
        {
            Console.WriteLine("Hi, my name is " + Name);
        }

    }

    public class Calculator
    {
        public static int Add(int a, int b)
        {
            return a + b;
        }
    }
}
