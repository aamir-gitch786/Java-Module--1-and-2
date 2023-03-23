
public class palindrom_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n,tem,rem,sum =0;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        tem = n;
        while(n!=0)
        {
        	rem = n % 10;
        	sum = sum* 10 + rem;
        	n/=10;
        }
       
        
        if(tem==sum)
        	System.out.println(tem+" is palindrom number.");
        else
        	System.out.println(tem+" is not a palindrom number");
	}

}
