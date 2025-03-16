package interview_programs;

public class FactorialNumber {

	public static void main(String[] args) {

		int num=5;
		long factorial=1;
	/*	for(int i=1;i<=5;i++)
		{
			factorial=factorial*i;
		}
		System.out.println("factorial of number is:"+ factorial);   */
		// Descending order
		for(int i=num;i>=1;i--)
		{
			factorial=factorial*i;
		}
		System.out.println("factorial of number is:"+factorial);
	}

}
