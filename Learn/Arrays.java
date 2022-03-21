package Learn;

public class Arrays {
	public static void main(String args[])
	{
//***  1D ARRAY	
     // 1:		
/*  	int [] array;  // Declaration
		array = new int[5]; // Memory allocation
		array[0] = 90;  // Initialization
		array[1] = 101;
		array[2] = 44;
		array[3] = 12;
		array[4] = 10;       */

     // 2:
/*		int [] array = new int[5]; // Declaration & Memory allocation
		array[0] = 90;  // Initialization
		array[1] = 101;
		array[2] = 44;
		array[3] = 12;
		array[4] = 10;  */
		
     // 3:
	/*	int [] array = {90,101,44,12,10}; // Declaration, Memory allocation & Initialization
	    
    // Display :		
		for (int i=0; i <array.length; i++)
	    	System.out.print(array[i]+" ");
	    
	    
	   // for-each loop 
	    for(int element : array)
	    	System.out.print(element+" ");
	}  */
//*** 2D ARRAY
		int [][] flats = new int[2][3]; 
		flats[0][0] = 100; 
		flats[0][1] = 101;
		flats[0][2] = 102;
		flats[1][0] = 201;
		flats[1][1] = 103;
		flats[1][2] = 104;
		
		for (int i=0; i <flats.length; i++)
		{
			for(int j=0; j<flats[i].length; j++)
				System.out.print(flats[i][j]+" ");
			System.out.println();	
		}
		
//*** 3D ARRAY	
		String [][][] arr = new String[2][3][4];
	}
}
