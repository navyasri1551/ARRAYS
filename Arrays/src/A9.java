public class A9 {
	public static void main(String[] args)
	{
		int a[][]=new int[4][4];
		if(a.length<4)
		{
			System.out.println("enter four elements");
		}
		
		if(a.length==4)
		{    int k=0;
		    for(int i=0;i<2;i++)
		    {    for(int j=0;j<2;j++)
		       {     a[i][j]=Integer.parseInt(args[k]);
		             k++;
		       }
		    }
		    System.out.println("given array is ");
		    for(int i=0;i<2;i++)
		    {   for(int j=0;j<2;j++)
		       {    System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
		    System.out.println("reverse array is");
		    for(int i=1;i>=0;i--)
		    {    for(int j=1;j>=0;j--)
		       {    System.out.print(a[i][j]+" ");
		       
		       }
		    System.out.println();
		    }
		}

		}
		
	}


