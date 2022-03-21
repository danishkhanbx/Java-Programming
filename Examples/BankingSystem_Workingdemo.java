package Examples;

import java.util.*;
class Account
{
	int account_no;
	String name;
	float amount;
	
	void insert(int a,String n, float amt)
	{
		account_no = a;
		name = n;
		amount = amt;
	}
	void deposit(float amt)
	{
		amount += amt;
		System.out.println(amt+" Deposited");
	}
	
	void withdraw(float amt)
	{
		if(amount < amt)
			System.out.println("Insufficient Balance");
		else
		{
			amount -= amt;
			System.out.println(amt+" Withdrawn");
		}
	}
	
	void checkBalance()
	{
		System.out.println("Total Balance: "+amount);
	}
	
	void display()
	{
		System.out.println("\nAccount Number : "+account_no);
		System.out.println("Customer Name : "+name);
		System.out.println("Customer Amount: "+amount);
	}
}

public class BankingSystem_Workingdemo
{
	public static void main(String args[])
	{
		int account_no;
		String name;
		float amount;
		
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account();
		
		System.out.print("Enter Account number: ");
		account_no =sc.nextInt();
		
		System.out.print("\nEnter Customer name: ");
		name =sc.next();
		
		System.out.print("\nEnter Customer amount: ");
		amount =sc.nextFloat();
		
		a1.insert(account_no,name,amount);
		a1.display();
		a1.checkBalance();
		
		System.out.print("\nEnter Amount to be Deposited: ");
		float dep_amount =sc.nextFloat();
		a1.deposit(dep_amount);
		a1.checkBalance();
		
		System.out.print("\nEnter Amount to be Withdrawn: ");
		float wit_amount =sc.nextFloat();
		a1.withdraw(wit_amount);
		a1.checkBalance();
		
		System.out.println("\n THANK YOU!!");
	}
}