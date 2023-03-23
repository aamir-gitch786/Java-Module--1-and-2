
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* --> Error
		System.out.printf();
		System.out.format();
		System.out.print();
*/ int a=10,b=5;
		System.out.println();//no error because it take new line as a argument.
		System.out.println(10+'h');
		System.out.println(10+"h");
		System.out.println(10+2+"h"+5);
		System.out.println(10+"h"+3+4);
		System.out.println(10+"h"+(3+4));
		System.out.println(a+'a'+"hi"+'a');
//we can only apply plus(+) operator with string.
	
/* --> Error
		System.out.println(a+'a'+"hi"-'a');
		System.out.println(a+'a'+"hi"*'a');
		System.out.println(a+'a'+"hi"/'a');
  */
	
		
		System.out.println(a*3+"hi"+b*2);
		System.out.println(3-b+"hi"+'a'+3);
		System.out.println(a+"hi"+45/9);
		System.out.println("Sum is :"+(a+b));
		System.out.println(a+b+"hi"+'a');
		System.out.println('a'+b+"hi"+'a'+'b');
	}

}
