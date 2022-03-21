package Learn;

/* Throw keyword:
 * In Java, exceptions allows us to write good quality codes where the errors are checked at the compile time instead of runtime and we can create custom exceptions making the code recovery and debugging easier.
 * The Java throw keyword is used to throw an exception explicitly.We specify the exception object which is to be thrown.
 * The Exception has some message with it that provides the error description. These exceptions may be related to user inputs, server, etc.
 * We can throw either checked or unchecked exceptions in Java by throw keyword. It is mainly used to throw a custom exception. We will discuss custom exceptions later in this section.
 * We can also define our own set of conditions and throw an exception explicitly using throw keyword.
 */

/* Throws Keyword:
 * The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception. 
 * So, it is better for the programmer to provide the exception handling code so that the normal flow of the program can be maintained.
 *  The caller to these methods has to handle the exception using a try-catch block. 
 */

/* Finally Keyword:
 * Java finally block is always executed whether an exception is handled or not. 
 * Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.
 * finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.
 * The important statements to be printed can be placed in the finally block.
 * Three cases:
 1) Exception is handled //Output: java.lang.ArithmeticException /by zero   Finally
 2) Exception not is handled //Output: Finally   error red message
 3) Exception is not present //Output: Finally
 */

/* Exception Class
 * We can write our custom Exceptions using the Exception class in java.
 * Syntax:
public class MyException extends Exception {
       // Overridden methods
}
 * The Exception class has the following important methods:
 1) Strings toString() executed when sysout (e) is ran
 2) Void printStackTrace() - prints Stack trace
 3) String getMessage() - prints the exception message
 */

class NegativeRadiusException extends Exception
{
    @Override
    public String toString() 
    {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() 
    {
        return "Radius cannot be negative!";
    }
}

public class throw_throws_ExceptionClass_finally {
	public static double area(int r) throws NegativeRadiusException
	{
        if (r<0)
            throw new NegativeRadiusException();
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException
    {
        int result = a/b;
        return result;
    }
    public static void main(String[] args) 
    {
        try
        {
            double ar = area(6);
            System.out.println(ar);
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
        finally
        {
        	System.out.println("Finally");
        }
    }
}
