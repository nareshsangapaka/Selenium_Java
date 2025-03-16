package interview_programs;

public class Swap2Number {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		System.out.println("before Swap value:"+a+" "+b);
		// Logic 1 third variable
	/*	int c = a;    // c =10
			a = b;	  // a = 20	
			b = c;    // b = 10 */
		
		// 2 add&sub
		/*	a = a+b;
		    b = a-b;
		    a = a-b; */
		// 3 Multiple & Division
		/* a = a*b;
		   b = a/b;
		   a = a/b;  */
		// 4 single statement
		b = a+b - (a=b); // a=20,a+b = 30 b=30 - 20 = 10
		
		
		System.out.println("After Swap value:"+a+" "+b);	
		
	}

}
