package Learn;

/*       exception in try                                           handled in catch     
 *  1) { int b=5/0; }                                            (ArithmeticException e)
 *  2) { int a[]= new int[5]; a[6] =98; }                        (ArrayIndexOutOfBoundsException e)
 *  3) { String str="hello"; int num=Integer.parseInt(str); }    (NumberFormatException e)
 *  4) { String str=NULL; sysout( str.length() ); }              (NullPointerException e)
 *  5) don't know which exception                                (Exception e)
*/
class Excep
{
	void diplay()
	{
		try
		{
			int b=5/0;                                            
			int a[]= new int[5]; 
			a[6] =98; 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Exception Handled...");
	}
}

public class tryandcatch {
	public static void main(String args[])
	{
		Excep obj = new Excep();
		obj.diplay();	
	}
}

/* Nested Try and Catch Blocks:
// outer (main) try block  
try {  
    
  //inner try block 1   
    try {  

     // inner try block 2  
        try {  
            int arr[] = { 1, 2, 3, 4 };  
            System.out.println(arr[10]);    //printing the array element out of its bounds  
        }   
        catch (ArithmeticException e)  // to handles ArithmeticException 
        {  
            System.out.println("Arithmetic exception");  
            System.out.println(" inner try block 2");  
        }  
    }   
    catch (ArithmeticException e)  // to handle ArithmeticException  
    {  
        System.out.println("Arithmetic exception");  
        System.out.println("inner try block 1");  
    }  
}  

catch (ArrayIndexOutOfBoundsException e4)  // to handle ArrayIndexOutOfBoundsException   
{  
    System.out.print(e4);  
    System.out.println(" outer (main) try block");  
}  
catch (Exception e5) 
{  
    System.out.print("Exception");  
    System.out.println(" handled in main try-block");  
}   
*/

