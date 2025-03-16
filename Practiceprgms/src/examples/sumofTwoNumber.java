package examples;

public class sumofTwoNumber {

	public static void main(String[] args) {
		
		int[] a = new int[] {1,5,3,8,10};
		int sum = 0;
		for(int i=0; i<a.length; i++){
			sum = sum+a[i];
			System.out.println("sum of array is:"+sum);
		}

	}

}
