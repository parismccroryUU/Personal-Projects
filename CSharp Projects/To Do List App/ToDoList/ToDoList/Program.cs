using System.ComponentModel.Design;

{
    Console.WriteLine("Welcome to the To-Do List Application!");
    List<string> taskList = new List<string>();
    string option = " ";

    while (option != "e")
    {
        Console.WriteLine("\nWhat would you like to do?");
        Console.WriteLine("\nEnter 1 to enter a task to the list");
        Console.WriteLine("Enter 2 to remove a task from the list");
        Console.WriteLine("Enter 3 to view the list");
        Console.WriteLine("Enter e to exit the program");

        option = Console.ReadLine();

        if (option == "1")
        {
            Console.WriteLine("\nPlease enter the name of the task you want to add to the list:");
            string task = Console.ReadLine();
            taskList.Add(task);
            Console.WriteLine($"Task ({task}) added to the list.");
        }
        else if (option == "2")
        {
            if (taskList.Count == 0)
            {
                Console.WriteLine("There are no tasks to remove.");
            }
            else
            {
                for (int i = 0; i < taskList.Count; i++)
                {
                    Console.WriteLine(i + " : " + taskList[i]);
                }
                Console.WriteLine("\nPlease enter the number of the task to remove from the list:");
                try
                {
                    int taskNumber = Convert.ToInt32(Console.ReadLine());
                    taskList.RemoveAt(taskNumber);
                    Console.WriteLine($"Task number {taskNumber} removed from the list.");
                }
                catch (FormatException)
                {
                    Console.WriteLine("Invalid input. Please enter a valid task number not text.");
                }
                catch (ArgumentOutOfRangeException)
                { 
                    Console.WriteLine("item # does not exist. Please try again.");
                }
            }   
        }
        else if (option == "3")
        {
            Console.WriteLine("\nCurrent tasks in the list :");
            for (int i = 0; i < taskList.Count; i++)
            {
                Console.WriteLine(taskList[i]);
            }
        }
        else if (option == "e")
        {
            Console.WriteLine("\nExiting program");
        }
        else
        {
            Console.WriteLine("\nInvalid option. Please try again.");
        }
    }
    Console.WriteLine("Thank you for using the To-Do List Application!");
}