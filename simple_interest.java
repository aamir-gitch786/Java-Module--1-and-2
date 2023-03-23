
public class simple_interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// WAP to find the simple interest of a given principle, Rate of interest and Time.
		double P,R,T;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter principle , Rate of interest and Time : ");
		P=sc.nextDouble();
		R=sc.nextDouble();
		T=sc.nextDouble();
		System.out.println("Simple interest is : "+P*R*T);
		
		
		
	}

}
