package examples;

public class SumOfTwoDimArray {

	public static void main(String[] args) {

		int[][] a = new int[3][3];
		
		a[0][0] = 1;
		a[0][1] = 8;	
		a[0][2] = 4;
		
		a[1][0] = 9;
		a[1][1] = 7;	
		a[1][2] = 2;
			
		a[2][0] = 7;
		a[2][1] = 6;	
		a[2][2] = 4;
		
		int sum = sumofelement(a);
		System.out.println("Sum of matrix elements: " + sum);
	}
	
		public static int sumofelement(int[][] arr) {
			
		int sum= 0;
			 		
		  for(int i=0; i<arr.length; i++) {
			  
		  	for(int j=0; j<arr[i].length; j++) {
		  		
		  		sum +=arr[i][j];
		  	      }
		 	    }
			return sum;	

		   }
	}

