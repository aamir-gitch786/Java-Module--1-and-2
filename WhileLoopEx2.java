
public class WhileLoopEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n;
		System.out.println("Enter the number :");
		n = sc.nextInt();
		while(n!=0)
		{
			System.out.print(n%10);
			n/=10;
		}
			

	}

}
/*
 
*/