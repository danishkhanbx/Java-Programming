package Examples;

public class Pattern2 
{

	public static void main(String[] args) 
	{
		int a = 10;
        for (int i = 4; i>0; i--) 
        {
            for (int j = i; j>0; j--) 
                System.out.print(a--%10 + "\t");
            System.out.println();
        }
	}

}