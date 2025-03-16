package interview_programs;

public class MaxAndMinElementsInArray {

	public static void main(String[] args) {

		int a[]= {50,30,40,20,15}; 
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
	
			if(a[i]>max){
				
				max=a[i];
				
		}
			if(a[i]<min){
				
				min=a[i];
		}
	}
		System.out.print("Maxmum Elements in Array is:"+max);
		System.out.println();
		System.out.print("Minimum elements in array is:"+ min);

	}

}
