import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new Scanner(System.in);
		int n,No_digit=0,tem,rem,sum=0,tem1;
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		tem=n;
		tem1=n;
		while(n!=0)
		{
			No_digit++;
			n/=10;
		}
		
		while(tem!=0)
		{int result=1;//this variable result will change every time because it work for each individual digit.
			rem=tem%10;// it given the last digit each time .
		for(int i=1;i<=No_digit;i++)
		  {
			result=result*rem;// it is use for finding the power of digit according to no of digit present in the given number.
		  }
		  sum = sum + result;// it will store the value of result.
		  tem/=10; // it eliminate the digit that we used it.
		}
		
		if(sum==tem1)
			System.out.println(tem1+" is palindrom number.");
		else
			System.out.println(tem1+" is not a palindrom number.");
    }

}
