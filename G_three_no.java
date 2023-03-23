//WAP to find the greatest number among the three numbers.
public class G_three_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int a,b,c;
		System.out.println("Enter three numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a==b && b==c)
			System.out.println("All are equal number .");
		else if(a>b)
		{
			if(a>c)
				System.out.println(a+" is greatest number .");
			else
				System.out.println(c+" is greatest number .");
		}
		else
		{
			if(b>c)
				System.out.println(b+" is greatest number ");
			else
				System.out.println(c+" is greatest number ");
	   }
	}

}
