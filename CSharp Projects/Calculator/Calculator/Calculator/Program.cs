
using System;

namespace Calculator
{
    class Program
    {
        static void Main(string[] args)
        {
            double num1 = 0;
            double num2 = 0;
            double result = 0;

            string answer;
            bool validInput = false;

            Console.WriteLine("Hello! Welcome to the Calculator!");

            // Get the first number
            do
            {
                try
                {
                    Console.WriteLine("Please enter the first number:");
                    num1 = Convert.ToDouble(Console.ReadLine());
                    validInput = true;
                }
                catch (FormatException)
                {
                    Console.WriteLine("Invalid input! Please enter a number.");
                    num1 = 0;
                }
            } while (!validInput);

            // Reset validation for the second number
            validInput = false;

            // Get the second number
            do
            {
                try
                {
                    Console.WriteLine("Please enter your second number.");
                    num2 = Convert.ToDouble(Console.ReadLine());
                    validInput = true;
                }
                catch (FormatException)
                {
                    Console.WriteLine("Invalid input! Please enter a number.");
                }
            } while (!validInput);

            Console.WriteLine("What type of operation would you like to do?");
            Console.WriteLine("Please enter + for addition, - for subtraction, * for multiplication, or / for division.");

            answer = Console.ReadLine();

            if (answer == "+")
            {
                result = num1 + num2;
            }
            else if (answer == "-")
            {
                result = num1 - num2;
            }
            else if (answer == "*")
            {
                result = num1 * num2;
            }
            else if (answer == "/")
            {
                if (num2 != 0)
                {
                    result = num1 / num2;
                }
                else
                {
                    Console.WriteLine("Error: Cannot divide by zero.");
                    Console.ReadKey();
                    return;
                }
            }
            else
            {
                Console.WriteLine("Invalid operation.");
                Console.ReadKey();
                return;
            }

            Console.WriteLine("The result is " + result);
            Console.WriteLine("Thank you for using the calculator!");

            Console.ReadKey();
        }
    }
}
