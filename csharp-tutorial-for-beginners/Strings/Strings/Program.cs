using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Strings
{
    class Program
    {
        static void Main(string[] args)
        {
            string firstName = "Mosh";       //Using string keyword
            var myFirstName = "Bill";        //using Var and it knows string
            String OtherFirstName = "Other"; //using String class

            string lastName = "Ham";
            var myLastName = "Costantini";
            String OtherLastName = "Other";

            var fullName = firstName + " " + lastName;
            var myFullName = string.Format("My name is {0} {1})", firstName, lastName);

            var names = new string[3] { "John", "Jack", "Mary" };
            var formattedNames = string.Join(",", names);
            Console.WriteLine(formattedNames);

            var text = "Hi John\nLook into the following paths\nc:\\folder1\\folder2\nc:\\folder3\\folder4";
            Console.WriteLine(text);
            Console.WriteLine("\n");

            var text2 = @"Hi John
Look into the following paths
c:\folder1\folder2
c:\folder3\folder4";
            Console.WriteLine(text2);

        }
    }
}
