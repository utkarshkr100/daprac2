import java.util.Scanner;

public class TowerOfHanoi 
{
	 static void TOH(int n,int A,int B,int C)
	    {	
	        if(n==0)
	        {
	            return;
	        }
	        if(n>0)
	        {
	           TOH(n-1,A ,C,B);
	           System.out.println("move disk "+n+" from rod "+A+" to rod "+C);
	           TOH(n-1,B,A,C);
	           
	        }
	    }
		public static void main (String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			TOH(n,1,2,3);
			sc.close();
		}
}
