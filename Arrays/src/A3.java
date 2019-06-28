import java.util.Scanner;

public class A3 {

	public static void main(String[] args)
	{
		int n[]=new int[] {1,4,34,56,7};
		int a=Integer.parseInt(args[0]);
		int c=-1;
		for(int i=0;i<n.length;i++)
		{   
			if(n[i]==a)
		    c=i;
		}
		if(c!=-1)
		   System.out.println(c);
		else
		System.out.println("-1");

		}
		
	}
