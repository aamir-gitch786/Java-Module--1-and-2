
public class primeNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc = new java.util.Scanner(System.in);
        int n,i;
        System.out.println("Enter the number : ");
        n = sc.nextInt();
        for( i=2;i<n;i++)
        {
        	if(n%i==0)
        		break;
        }
        	if(i==n)
        		System.out.println(n+" is a prime number ");
        	else
        		System.out.println(n+"is not a prime number ");
	}

}


/*

public class PrimeNo {
	public static void main(String[] args) {
java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.println("Enter a number to find Prime:");
		int n=sc.nextInt();
		
		if(n>1) {
			boolean flag=true;
			for(int x=2;x<=n/2;x++) {
				if(n%x==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(n+" is Prime.");
			}else {
				System.out.println(n+" is NOT Prime.");
			}
		}else {
			System.out.println(n+" is NOT Prime.");
		}
	}

*/