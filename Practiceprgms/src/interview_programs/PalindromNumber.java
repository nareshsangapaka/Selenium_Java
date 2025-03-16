package interview_programs;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num =Sc.nextInt();
		int org_num= num;
		int rev=0;
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) {
			System.out.println(org_num +":is Polindrome Number");
		}
		else {
			System.out.println(org_num+ ":is Not Polindrome Number");
		}
	}

}
