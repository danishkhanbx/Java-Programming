package Examples;

class Accountz
{
	String cust_name;
	int acc_no;
	
	Accountz(String a,int b)     // from 4
	{
		cust_name = a;
		acc_no = b;
	}
	
	void display()
	{
		System.out.println("Customer Name: "+cust_name);
		System.out.println("Account Number: "+acc_no);
	}
}

class Online extends Accountz
{
	Online(String a, int b)    // from x
	{
		super(a,b);          // ----(4)
	}
	void display()
	{
		System.out.println("Customer-ID: "+(cust_name+acc_no%10));
		System.out.println("Customer Password: "+(acc_no/10+8));
	}
}

class Saving_Acc extends Accountz
{
	int min_bal, saving_bal;
	Saving_Acc(String a, int b, int c, int d) // from 2
	{
		super(a,b);                         // ----(3)
		min_bal = c;
		saving_bal = d;
	}
	void display()
	{
		super.display();
		System.out.println("Minimun Balance: "+min_bal);
		System.out.println("Saving Balance: "+saving_bal);
	}
}

class Acct_Details extends Saving_Acc
{
	int deposit, withdraw;
	Acct_Details(String a, int b, int c, int d, int e, int f) // from 1
	{
		super(a,b,c,d);                                     // ----(2)
		deposit = e;
		withdraw = f;
	}
	void display()
	{
		super.display();
		System.out.println("Deposit: "+deposit);
		System.out.println("Total Withdrawals: "+withdraw);
	}
}

public class Implement_SingleandMultilevel_usingSuper {
	public static void main(String args[])
	{
		Acct_Details A = new Acct_Details("Danish Khan",936529764,1000,5050,100,9000); // ----(1)
		Online ol=new Online("danishkhanbx",936529764);                               // ---(x)
		A.display();    // it calls Acct_Details display which keep calling its super and then printing in return time
		ol.display();  // it calls Online which calls is super and takes value from it, then it displays 
		// execution order: from 4 -> from 2 -> from 1 -> from x
	}
}