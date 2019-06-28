
public class A5 {
	public static void main(String[] args)
	{
		int a[]= {9,56,1,7,10,40,22,12,4,99,100};
		int temp;
		for(int i = 0; i <a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
		System.out.println("the first largest number in an array is " +a[0]);
		System.out.println("the second largest number in an array is " +a[1]);
		System.out.println("the first smallest number in an array is " +a[a.length-2]);
		System.out.println("the second smallest number in an array is " +a[a.length-1]);
		
	}

}
