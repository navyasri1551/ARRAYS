
public class A6 {
	public static void main(String[] args)
	{
	int a[]= {9,56,1,7,10,40,22,12,4,99,100};
	int temp;
	int i;
	for(i = 0; i <a.length; i++)
    {
        for(int j = i + 1; j < a.length; j++)
        {
            if(a[i] > a[j])
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
	for(int k=0;k<a.length;k++)
	{
	System.out.print(a[k]+" ");
	}

}
}