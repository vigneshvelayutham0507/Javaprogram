package trident.training;

public class ForEachloop {

	public static void main(String[] args) {
		int[] numbers = {3, 9, 5, -5};
		int sum = 0;
	    
	     
	    for (int num: numbers) {
	    	sum += num;
	      System.out.println(num);
	    }
	    System.out.println("Sum = " + sum);
	}

}
//int data type
//num each item of array
// numbers array