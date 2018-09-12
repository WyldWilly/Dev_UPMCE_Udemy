using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Enums
{

    public enum shippingMethod
    {
        RegularAirMail = 1,
        RegisteredAirMail = 2,
        Express = 3
    }

    class Program
    {
        static void Main(string[] args)
        {
            var method = shippingMethod.Express;
            Console.WriteLine((int)method);

            var methodId = 3;
            Console.WriteLine((shippingMethod)methodId);

            Console.WriteLine(method.ToString());
            Console.WriteLine(method); // because CW automatically casts it to string

            string methodName = "Express";
            shippingMethod = Enum.Parse(typeof(shippingMethod), methodName);
        }
    }
}
