
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 25.6748286786;
		System.out.printf("%f\n",a);
		System.out.format("%f%n",a);
		System.out.print(a+"\n");
		System.out.println(a);
// if we use %n in print then it will print as it is because print is not work on formate specifer.		
		System.out.printf("%.2f\n",a);
		System.out.format("%.2f\n",a);
		System.out.printf("%.12f\n",a);
		System.out.format("%.12f\n",a);
	}

}
