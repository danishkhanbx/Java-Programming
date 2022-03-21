package Examples;

import java.util.*;
public class GCD_usingEuclidsAlgo {
/* GCD(A,0) = A
 * GCD(0,B) = B
 * Write A in quotient remainder form (A = B⋅Q + R)
 * If A = B⋅Q + R and B≠0 then GCD(A,B) = GCD(B,R) where Q is an integer, R is an integer between 0 and B-1. */	
	public static void main(String args[])
	{
		Scanner ng = new Scanner(System.in);
		
		System.out.print("Enter number1: ");
		int num1= ng.nextInt();
		System.out.print("Enter number2: ");
		int num2=ng.nextInt();	
		
		System.out.println("GCD of two numbers " + num1 +" and " + num2 +" is :" + findGCD(num1,num2));
	}
	
	private static int findGCD(int num1, int num2) 
	{  
		if(num2 == 0)
		{ 
			return num1;
		}	
		  return findGCD(num2, num1%num2); 
	}	
}
/* Proof: GCD(A,0)=A is as follows:
 * The largest integer that can evenly divide A is A.
 * All integers evenly divide 0, since for any integer, C, we can write C ⋅ 0 = 0. So we can conclude that A must evenly divide 0.
 * The greatest number that divides both A and 0 is A. */
  

