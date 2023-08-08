package test;

public class Day1 {

	public static void main(String[] args) {
		//int x =10;
		//char c = 'a';
		//boolean b =true;
		
		//String str = "welcome";
		System.out.print("Hello ");
		System.out.println("Aditi");
		System.out.println("sum of two numbers " + (34+76));
		int a =10;
		int b =20;
		int c = a+b ;
		System.out.println("the value of a =" + (c-a));	
		System.out.println("the value of b =" + (c-b));
		int i =0;
		while(i<=10)
		{
			System.out.println(i);
			i++;
			
		}
		int j =1;
		
		do {
			System.out.println(j);
			j++;
		}
		 while(j<=10);
		
		
		int z=5;
		for (int k=1;k<=10;k++)
		{
			System.out.println(z + "x" + k + "=" + (z*k));
			
			
		}
		
		int num =109865;
		int count=0 ;
		while(num !=0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		
		
		
		
		
		
	}

}
