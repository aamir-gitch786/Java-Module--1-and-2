public class IfElseEx2 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a first number:");
		int a=sc.nextInt();
		System.out.println("Enter a second number:");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+" is Greater");
		}else {
			System.out.println(b+" is Greater");
		}
		System.out.println("Thanks for using APP");
	}

}