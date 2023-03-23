
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	java.util.Scanner sc= new java.util.Scanner(System.in);
	int n,i;
	System.out.println("Enter the positive number :");
	n = sc.nextInt();
	for( i=2;i<n;i++)
	   {
		 if(n%i==0)
		 break;
	   }
	if(i==n)
		System.out.println(n+" is a prime number .");
	else
		System.out.println(n+" is not a prime number .");
  }

}
