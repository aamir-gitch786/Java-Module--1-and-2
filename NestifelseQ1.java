
public class NestifelseQ1 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		System.out.println("Enter second number:");
		int b=sc.nextInt();
		if(a==b) {
			System.out.println("Both number are same numbers");
		}else 
		{
			if(a>b) 
			{
				System.out.println(a+" is Greater");
			}else 
			{
				System.out.println(b+" is Greater");
			}
		}
		System.out.println("Thanks for using APP");
	}

}