using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CSharpFundamentals.Math;

namespace CSharpFundamentals
{
    class Program
    {
        static void Main(string[] args)
        {
            Person john = new Person();
            var james = new Person();

            john.FirstName = "John";
            john.LastName = "Smith";

            james.FirstName = "James";
            james.LastName = "Smith";

            john.Introduce();
            james.Introduce();

            Calculator calculator = new Calculator();
            var result = calculator.Add(5, 6);
            Console.WriteLine(result);
        }
    }
}
