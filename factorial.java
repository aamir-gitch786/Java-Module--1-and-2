// WAP to find factorial of a given number.
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int n,i,result=1;
		System.out.println("Enter the number :");
		n=sc.nextInt();//for stroing the number given by user end.
		if(n<0)
			System.out.println("please enter positive number .");
		else if(n==0)
			System.out.println("Factorial of "+n+" is :"+1);
		else
		{
			for( i=1;i<=n;i++)
				result*=i;	
			System.out.println("Factorial of "+n+" is :"+result);
		}
		
     }

}
