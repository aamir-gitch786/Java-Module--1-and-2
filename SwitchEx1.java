
public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a =sc.nextInt();
		switch(a)
		{
		//case "1";-->Error because a is a type int , you can but when a is type of string.
		case 1://Okay
		case '1'://its okay because it trease as a ascii number (49)
  //		case a:-->Error because a is variable it may contain same value which is alreay presnet in other case.
			
		
		}
		

	}

}
