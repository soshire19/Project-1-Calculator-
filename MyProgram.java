public class MyProgram extends ConsoleProgram
{
    public void run()
    {
        Calculator calc1 = new Calculator();
        // Greet user :)
        String greeting = readLine("Hi, What's your name?");
        System.out.println("Hello, " + greeting + " let's get started!");
        System.out.println("Select the following: ");
        boolean run = true;
        // create While loop 
        while (run)
        {
            //Ask the user whether they want to: add, subtract, multiply, or divide numbers.
            String pick1 = readLine ("Pick (a) to add, Pick (b) to subtract, Pick (c) to muliply, and Pick (d) to divide: ");
            System.out.println(pick1);
            if (pick1.equals ("a"))
            {
                //Ask the user what type of data the number is: integer or double.
                String choose2 = readLine ("Pick (a) for int, or Pick (b) for double:");
                System.out.println(choose2);
                // Addition for both int & double 
                if (choose2.equals("a"))
                {
                    //Ask the user for two numbers.
                    int num1 = readInt ("Pick your first number:");
                    int num2 = readInt ("Pick your second number:");
                    int result = calc1.add(num1,num2); 
                    System.out.println("result:");
                    System.out.println(result);
                }
                else if (choose2.equals("b"))
                {
                    //Ask the user for two numbers.
                    double num1 = readDouble ("Pick your first number:");
                    double  num2 = readDouble ("Pick your second number:");
                    double result = calc1.add(num1,num2); 
                    System.out.println("result:");
                    System.out.println(result);
                }
            }
            // Subtraction for both int & double 
            else if (pick1.equals("b"))
            {
                //Ask the user what type of data the number is: integer or double.
                String choose2 = readLine ("Pick (a) for int, or Pick (b) for double:");
                System.out.println(choose2);
                if (choose2.equals("a"))
                {
                    //Ask the user for two numbers.
                    int num1 = readInt ("Pick your first number:");
                    int num2 = readInt ("Pick your second number:");
                    int result = calc1.sub(num1,num2); 
                    System.out.println("result:");
                    System.out.println(result);
                }
                else if (choose2.equals("b"))
                {
                    //Ask the user for two numbers.
                    double num1 = readDouble ("Pick your first number:");
                    double  num2 = readDouble ("Pick your second number:");
                    double result = calc1.sub(num1,num2); 
                    System.out.println("result:");
                    System.out.println(result);
                }
            }
            //Multiplication for both int & double 
            else if (pick1.equals("c"))
            {
                //Ask the user what type of data the number is: integer or double.
                String choose2 = readLine ("Pick (a) for int, or Pick (b) for double:");
                System.out.println(choose2);
                if (choose2.equals("a"))
                {
                    //Ask the user for two numbers.
                    int num1 = readInt ("Pick your first number:");
                    int num2 = readInt ("Pick your second number:");
                    int result = calc1.multi(num1,num2); 
                    System.out.println("result:");
                    System.out.println(result);
                }
                else if (choose2.equals("b"))
                {
                    //Ask the user for two numbers.
                    double num1 = readDouble ("Pick your first number:");
                    double  num2 = readDouble ("Pick your second number:");
                    double result = calc1.multi(num1,num2); 
                    System.out.println("result:");
                    System.out.println(result);
                }
            }
            //Division for both int & double 
            else if (pick1.equals("d"))
            {
                //Ask the user what type of data the number is: integer or double.
                String choose2 = readLine ("Pick (a) for int, or Pick (b) for double:");
                System.out.println(choose2);
                if (choose2.equals("a"))
                {
                    //Ask the user for two numbers.
                    int num1 = readInt ("Pick your first number:");
                    int num2 = readInt ("Pick your second number:");
                    int result = calc1.divide(num1,num2); 
                    System.out.println("result:");
                    System.out.println(result);
                }
                else if (choose2.equals("b"))
                {
                    //Ask the user for two numbers.
                    double num1 = readDouble ("Pick your first number:");
                    double  num2 = readDouble ("Pick your second number:");
                    double result = calc1.divide(num1,num2); 
                    System.out.println("result:");
                    System.out.println(result);
                }
            }
            
             run = readBoolean ("Would you still like to continue?");
                
        }    
       
       
        
        
    }
}