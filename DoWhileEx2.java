
public class DoWhileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String choice;
		do {
			System.out.println("Enter a number : ");
			int n = sc.nextInt();
			System.out.println("Square of "+n+" is "+n*n);
			System.out.println("Do you wanna a continue to find other number square [Yes/No] ");
			choice =sc.next();
			
	     }while(choice.equalsIgnoreCase("Yes"));
    
	}

}

/*
 public class DoWhileLoopEx2 {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		String choice;
		do {
			System.out.println("Enter a Number:");
			int n=sc.nextInt();
			System.out.println("Square of "+n+" is "+n*n);
			
			System.out.println("Do you wanna continue?[yes/no]");
			choice=sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		
		
		System.out.println("Thanks for using My App.");
	}
}
*/