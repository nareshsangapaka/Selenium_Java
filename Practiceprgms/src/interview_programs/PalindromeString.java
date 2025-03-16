package interview_programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		String str,rev="";
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your String:");
		
		 str= sc.nextLine();
		 
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev= rev+str.charAt(i);
			}
		
		if(str.equals(rev)) {
			System.out.println(str+":is Palindrome String");
		}
		else {
		
			System.out.println(str+":is not palindrpme String");
		}
	}
	
}

