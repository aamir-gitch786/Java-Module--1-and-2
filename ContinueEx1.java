
public class ContinueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int a = 1; a<=5;a++)
       {
    	   System.out.println("Aamir");
    	   continue;
  //-->Error System.out.println("Shekh"); because it become unreachable code.
       }
	}

}


