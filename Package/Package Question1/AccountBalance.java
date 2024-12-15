import MyPack.Balance;
public class AccountBalance{
	public static void main(String args[])
	{
		Balance Current[]= new Balance[3];
		Current[0]= new Balance("a",1000.0);
		Current[1]= new Balance("b",2000.0);
		Current[2]= new Balance("c",-2.0);
		for(int i=0;i<3;i++)
		{
			Current[i].displayShow();
		}
	}
}