import java.util.Scanner;

public class Tribonacciii
{
	static int tribonacci(int n) 
    {
        if(n<2&&n>0)
        {
            return 1;
        }
        else if(n>=2)
        {
            return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
        }
        return 0;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(tribonacci(n));
	}

}
