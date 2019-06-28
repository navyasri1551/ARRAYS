public class A8 {
	public static void main(String[] args)
	{
		int a[]= {10,3,6,1,2,7,9};
		boolean f=false;
		int sum=0;
		for(int x:a)
		{
			if(x==6)
			{
				f=true;
			}
		
		if(f==true)
		{
		}
		else
		{
			sum=sum+x;
		}
		if((f==true)&(x==7))
		{
			f=false;
		}
		
		}
		System.out.println(sum);
		
		
		
	}

}
