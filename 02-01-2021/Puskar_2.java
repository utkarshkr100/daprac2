import java.util.Scanner;

public class SortedOrNot 
{
	static int Check(int []arr,int len)
	{
		if(len==0)
		{
			return 1;
		}
		else if(len>0)
		{
			if(arr[len]>arr[len-1])
			{
				return Check(arr,len-1);
			}
			else
			{
				return 0;
			}
		}
		else
			{return 0;}
	}
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int arr[]=new int[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextInt();
		}
		int x=Check(arr,len-1);
		if(x==1)
		{
			System.out.println("Array is Sorted");
		}
		else 
		{
			System.out.println("Array is  Not Sorted");
		}
	}
}
