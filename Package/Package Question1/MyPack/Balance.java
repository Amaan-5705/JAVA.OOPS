package MyPack;
public class Balance{
	String name;
	double balance;
	public Balance(String s, double d)
	{
	 	name=s;
		balance=d;
	}
	public void displayShow()
	{ 	
		if(balance<0)
		{
			System.out.println("No balance");
		}
		if (balance>0)
		{
			System.out.println("Name"+" "+name);
			System.out.println("Balance"+" "+balance);
		}
	}
}