package examples;

public class Sumof2D {

	public static void main(String[] args) {
		
		 // declare and initialize the 2D matrix
	      int[][] a = new int[3][3];
	      a[0][0] = 1;
	      a[0][1] = 9;
	      a[0][2] =	7;
	      
	   	  a[1][0] = 8;
 	      a[1][1] = 7;
   	      a[1][2] = 6;
	    	      
		  a[2][0] = 4;
	      a[2][1] = 2;
	      a[2][2] = 4;
	    		  
	      // Call the user-defined method to get the sum of all elements
	      int sum = sumOfMatElmt(a);
	      
	      // Print the result
	      System.out.println("Sum of matrix elements: " + sum);
	   }
	   
	   //user-defined method to find the sum of the elements
	   public static int sumOfMatElmt(int[][] arr) {
	      
	      // declare and initialize the sum variable
	      int sum = 0;
	      for (int i = 0; i < arr.length; i++) {
	         
	         // initiate the looping over each column of the current row
	         for (int j = 0; j < arr[i].length; j++) {
	            
	            // Add the current element to the sum
	            sum += arr[i][j];
	         }
	      }
	      
	      // Return the result
	      return sum;
	   }

	}


