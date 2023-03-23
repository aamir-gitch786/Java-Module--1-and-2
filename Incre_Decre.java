
public class Incre_Decre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=10,b=5;
     // b=++a-a;
//      b=++a-a+a++;
//     b=a--+a++-a+a++;
//      b=--a+a++-a--+a;
//      b=a++-++a+a--+a--+--a;
//      b=++a*a--+a--*--a;
//      b=--a+a++-a;
//      b=a++-++a-a--;
//    b=--a*a++/++a-a++-a--;
//     b=--a*a++/a--%a--+--a*a; 
//     b = a+++a;//a++ + a
//-> Error   b = a++++a;
//-> Error   b = a+++++a;
//      b= a+++ ++a;
      
      
  /*    
      int c=a++<b--? a++*++b/a : --b%a++-++b/b--;
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
  */
      boolean c = a++>--b || ++a!=b--;
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
	}

}
