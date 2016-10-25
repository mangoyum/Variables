
public class Variables {

	public static void main(String[] args) {
		int a = 63;
		int b = 45;
		
		//a = b;//assignment operator
		System.out.println("b is " + b);
		System.out.println("a is " + a);//both will be 45 since b is going into a

		a = a + 10;
		System.out.println("a is " + a);
		a += 10; //extended assignment operator; it is same as statement above

		//b + a + 10;
		//b += a; 
		
		a = a +1;//example of binary operator
		a += 1;// example of binary operator 
		a++; //increment (unary operator- takes one operand)
		
		System.out.println("a is " + a);
		
		double c = 3.14159;
		int d = (int)c;
		System.out.println("c is " + c);
		System.out.println("d is " + d);
		
		long e = Math.round(c);//to round the number; it's part of java.lang
		System.out.println("e is " + e);
	}

}
