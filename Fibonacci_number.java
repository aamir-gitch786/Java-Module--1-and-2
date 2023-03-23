//WAP to print Fibonacci series for n terms.
public class Fibonacci_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      java.util.Scanner sc = new java.util.Scanner(System.in);
      int first_term = 0 , second_term = 1,term,i,next_term;
      System.out.println("Enter the number of term :");
       term = sc.nextInt();
       System.out.println("Fibonacci series upto "+term+" terms is : ");
       if(term==1)
    	   System.out.println(0);
       else if(term==2)
    	   System.out.println(0+" "+1);
       else if(term>2)
          { 
    	   System.out.print(0+" "+1+" ");
    	   for( i=1;i<=term-2;i++)
    	   {
    		   next_term=first_term+second_term;
    		   System.out.print(next_term+" ");
    		   first_term = second_term;
    		   second_term = next_term;
    		   
    	   }
    	   
          }
    		   
      
	}

}
