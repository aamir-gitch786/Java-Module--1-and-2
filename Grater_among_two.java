//WAP to find the greatest number among the two numbers.
public class Grater_among_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
        int a,b;
        System.out.println("Enter two number : ");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a==b)
        	System.out.println("Both number is same.");
        else if(a>b)
        	System.out.println(a+" is greatest number .");
        else
        	System.out.println(b+" is greatest number .");
        	

	}

}
