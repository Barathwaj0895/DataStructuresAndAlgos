package dsalearning;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArray {
	public static void main(String args[]){
	      System.out.println("Enter the required size of the array :: ");
	      Scanner s = new Scanner(System.in);
	      int size = s.nextInt();
	      int myArray[] = new int [size];
	      int product = 1;
	      System.out.println("Enter the elements of the array one by one ");
	      for(int i=0; i<size; i++){
	         myArray[i] = s.nextInt();
	         product = product * myArray[i];
	      }
	      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
	      System.out.println("Product of the elements of the array ::"+product);
//		int[] arr = {1,3,5,10};
//		 int[] myArr;
//		 int p=1;
//		 for(int i=0; i<arr.length;++i) {
//			 
//		 }
	   }
}