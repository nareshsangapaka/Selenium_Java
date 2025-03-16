package interview_programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		// 1.using Algorithm
		/*int rev = 0;
		while(num!=0){
			rev = rev*10+num%10;
			num = num/10; 
			
		}*/
		// 2.using StringBuffer class
		
		/*StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		*/
		// using StringBuilder class
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		
		System.out.println("Reverse A Number:"+rev);
	}

}
