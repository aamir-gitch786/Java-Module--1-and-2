public class ifElseEx3 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a  first number:");
		int a=sc.nextInt();
		System.out.println("Enter a second number:");
		int b=sc.nextInt();
		System.out.println("Enter a third number:");
		int c=sc.nextInt();
		
		if(a==b && a==c) {
			System.out.println("All numbers are Same");
		}else if(a>b && a>c) {
			System.out.println(a+" is Greatest");
		}else if(b>c) {
			System.out.println(b+" is Greatest");
		}else {
			System.out.println(c+" is Greatest");
		}
		
		System.out.println("Thanks for using APP");
	}

}