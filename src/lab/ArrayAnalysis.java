package lab;

/*
 * See the link for lab explanation
 * #
 * 
 * 
 */

public class ArrayAnalysis {

	
	//#1
	public  int[][] createRandom(int row, int column, int min, int max){
	// create a random arr
		int[][] arr = new int[row][column];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				
				arr[i][j] = (int) (Math.random() * (max - min) + min);
				
				
			}
		}
		
		
		
		return arr;
	}
	
	
	//#2
	public static  void printArray(int[][] arr)  {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length-1; j++) {
				
				System.out.print(arr[i][j] + " ");  //prints 1 row
				
			}
			System.out.println();  //move cursor to next row
		}

		System.out.println();
	
	}
	
	
	//#3
	public static long sumTotal(int[][] arr) {
	// calcutate the sum
		long total =  0;
		for(int i = 0; i<arr.length; i++) {
	 for (int j=0; j<arr.length;  j++) {
			total = total + arr[i][j];
		}
		
	}
		return total;
	}
	
	
	//#4
	public static  double average(int[][] arr) {
	// finds the average
		long average = 0;
		int count = 0;
		for (int i =0;  i<arr.length; i++) {
			for(int  j = 0; j<arr.length;j++){
				count++;
			}
		}
		average = sumTotal(arr)/count;
		
		return average;
	}
	
	
	//#5
	public static int findMin(int[][] arr) {
// the min of the arr
		int minValue = Integer.MAX_VALUE;
       for(int i =  0;i<arr.length;i++) {
		for (int j = 0; j < arr.length; j++) {
       if(arr[i][j]<minValue) {
    	 minValue = arr[i][j];  
       }
        }
       }
        return minValue ;
    }
	
	
	//#6
	public static int findMax(int[][] arr) {
		// the max of the arr
		int maxValue = Integer.MIN_VALUE;
	        for (int j = 0; j < arr.length; j++) {
	            for (int i = 0; i < arr[j].length; i++) {
	                if (arr[j][i] > maxValue) {
	                    maxValue = arr[j][i];
	                }
	
	
	}	
	        	
	        }
	        return maxValue;
	}
	//#7
	public static int[][] diffArrays(int[][] arr1, int[][] arr2){
	int arr1RowCount = arr1.length;
	int arr1ColCount = arr1[0].length;
	int arr2ColCount = arr2[0].length;
	int arr2RowCount = arr2.length;
	if(arr1ColCount!=arr2ColCount) {
		return null;
	}
	else if (arr1ColCount != arr2ColCount) {
		
		return null; 
	}
	
	int[][] outputArr = new int[arr1RowCount][arr1ColCount]; 
	
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr1[i].length; j++) {
			
			outputArr[i][j] = arr1[i][j] - arr2 [i][j]; 
		}
	}
	
	return outputArr;
}
	
	
	//#8
	public static  int[][] transposeRow(int[][] arr1, int dist){
		int arr1RowCount = arr1.length;
		int arr1ColCount = arr1[0].length; 
		
		int[][] outputArr = new int[arr1RowCount][arr1ColCount]; 
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				
				outputArr[(i + dist) % arr1RowCount][j] = arr1[i][j]; 
			}
		}
		
		return outputArr;
	}
	//#9
	public static  long sum3D(int[][][] arr) {
		long total =  0;
		
for (int i = 0; i < arr.length; i++) {
			
			total = total + sumTotal(arr[i]); 
		}
		
		return total;
	
		
	}
	
	
	//#10
	public static double average3D(int[][][] arr) {
int count = 0; 
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					
					count++; 
				}
			}
		}
		
		long sum = sum3D(arr);
		double average = sum/count; 
		
		return average;
	}
	
	
	
	
		
	
	
	
	
	
}
