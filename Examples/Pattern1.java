package Examples;

public class Pattern1 
{

	public static void main(String[] args) 
	{
		int a = 1;
        for (int i = 1; i <= 4; i++) 
        {
            for (int j = 1; j <= i; j++) 
                System.out.print(a++%10 + "\t");
            System.out.println();
        }
	}

}
