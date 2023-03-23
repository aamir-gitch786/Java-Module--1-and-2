
public class Month_app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		switch(a)
		{
		   case 1:
			   System.out.println("January");
			   break;
		   case 2:
			   System.out.println("Febuary");
			   break;
		   case 3:
			   System.out.println("March");
			   break;
		   case 4:
			   System.out.println("April");
			   break;
		   case 5:
			   System.out.println("May");
			   break;
		   case 6:
			   System.out.println("June");
			   break;
		   case 7:
			   System.out.println("July");
			   break;
		   case 8:
			   System.out.println("Augest");
			   break;
		   case 9:
			   System.out.println("September");
			   break;
		   case 10:
			   System.out.println("October");
			   break;
		   case 11:
			   System.out.println("November");
			   break;
		   case 12:
			   System.out.println("December");
		   default:
			   System.out.println("Please enter valid month number!");
		}

	}

}
