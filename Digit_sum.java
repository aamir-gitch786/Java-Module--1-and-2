//WAP to find the digit sum of given number .
public class Digit_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       java.util.Scanner sc = new java.util.Scanner(System.in);
       int n,sum=0,tem;
       System.out.println("Enter the number : ");
       n = sc.nextInt();
       tem= n;
       while(n!=0)
       {
    	   int rem = n % 10;
    	   sum = sum + rem;
    	   n/=10;
       }
       System.out.println("Sum of digit of this number "+tem+ " is : "+ sum);
	}

}
