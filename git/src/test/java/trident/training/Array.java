package trident.training;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int []a= {12,13,32,23,31,22};
		int sum = 0;
		for(int i=0; i<a.length;i++)
		{
            sum += a[i];

			System.out.println(a[i] + sum );
		}


	}
}