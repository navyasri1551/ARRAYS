
public class A4 {
	public static void main(String[] args)
	{
		int a[]=new int[] {65,66,67,68,69,70,71,7,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,90,91};
		String str =null;
        for(int i: a){
            str = Character.toString((char)i);
            System.out.print(str);
        }
		
	}

}
