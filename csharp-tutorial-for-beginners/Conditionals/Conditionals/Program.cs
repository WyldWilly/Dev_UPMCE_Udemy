using System;


namespace Conditionals
{


    class Program
    {
        static void Main(string[] args)
        {
            int hour = 21;

            /* If Then Else */

            if (hour > 0 && hour < 12)
            {
                Console.WriteLine("It's Morning.");
            }
            else if (hour >= 12 && hour < 18)
            {
                Console.WriteLine("It's Afternoon.");
            }
            else
            {
                Console.WriteLine("It's Evening.");
            }

            bool isGoldCustomer = false;
            float price;

            if (isGoldCustomer)
            {
                price = 19.95f;
            }
            else
            {
                price = 29.95f;
            }

            Console.WriteLine(price);

            /* using conditional */
            float oPrice = (isGoldCustomer) ? 19.95f : 29.95f;
            Console.WriteLine(oPrice);

            /* Switch Case */
            var season = Season.Autumn;

            switch (season)
            {
                case Season.Autumn:
                    Console.WriteLine("Its autumn and a beautiful season.");
                    break;

                case Season.Spring:
                    Console.WriteLine("Its spring and its beautiful.");
                    break;

                case Season.Summer:
                    Console.WriteLine("Its summer and its hot.");
                    break;

                case Season.Winter:
                    Console.WriteLine("Its winter and its cold");
                    break;

                default:
                    Console.WriteLine("I have no idea what season it is?");
                    break;

            }


        }
    }
}
