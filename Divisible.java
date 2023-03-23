//WAP to find a given number is divisible by 5 and 3 both.
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the number : ");
        int a=sc.nextInt();
        if(a%3==0 && a%5==0)
        	System.out.println(a+" is divisible by 5 and 3 both.");
        else
        	System.out.println("Not divisible by both.");
	}

}
