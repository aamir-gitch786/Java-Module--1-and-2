//WAP to find the greatest number among the five numbers.
public class Among_five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int a,b,c,d,e,result;
		System.out.println("Please enter  five numbers : ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();

		if(a==b && b==c && c==d && d==e)
		   {
			System.out.println("All are equal number .");	
		   }
	    else if(a>b && a>c && a>d && a>e)
	      {
	    	System.out.println(a+" is greatest number ");	
	      }
		else if(b>c && b>d && b>e)
		  {
			System.out.println(b+" is greatest number ");	
		  }
		else if(c>d && c>e)
		  {
			System.out.println(c+" is greatest number ");		
		  }
		else if(d>e)
		  {
			System.out.println(d+" is greatest number ");
		  }		
		else
			System.out.println(e+" is greatest number ");

		
//Another methos:
/*
		result=a;//assume that a is greastest number;
		if(b>result)
		  result=b;
		
		if(c>result)
			result=c;
		
		if(d>result)
			result=d;
		
		if(e>result)
			result=e;
	System.out.println(result+"is a greatest number .");	
*/
	 
	}

}
