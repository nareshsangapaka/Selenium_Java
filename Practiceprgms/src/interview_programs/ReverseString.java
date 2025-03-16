
package interview_programs;

public class ReverseString {

	public static void main(String[] args) {
		// using concatenation operator
			String str= "ABCD";
			String rev= " ";
		/*	int len= str.length();
			str.charAt(0);
			for(int i=len-1;i>=0;i--) {
				rev= rev+str.charAt(i);
				
			}
			System.out.println("Reverse String is:"+ rev);
			*/
			// using character array
		/*	char a[]= str.toCharArray();
			int len= a.length;
			for(int i=len-1; i>=0; i--) {
				rev=rev+a[i];
			}
			System.out.println("Reverse A String is:"+ rev); */
			// using stringBuffer class
			StringBuffer sb= new StringBuffer(str);
					System.out.println("Reverse String is:"+ sb.reverse());
	}

}
