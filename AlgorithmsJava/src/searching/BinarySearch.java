package searching;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		Scanner scan =  new Scanner(System.in);
		System.out.println("Length of the array");
		int length = Integer.parseInt(scan.nextLine());
		int[] array = new int[length];
		System.out.println("Inserts elements into array");
		for (int i = 0; i < length; i++) {
			array[i] = Integer.parseInt(scan.nextLine());
		}
		System.out.println("Enter search element");
		int element = Integer.parseInt(scan.nextLine());
		int result = bs.binarysearch(array, element,0,length-1);
		if(result == -1) {
			System.out.println("Element is not found in given list");
		}else {
			System.out.println("Found at : "+(result+1));
		}
		
	}
	public int binarysearch(int[] array,int element,int start,int end) {
		int mid = (start+end)/2;
		if(end < start) {
			return -1;
		}
		if(array[mid] == element ) {
			return mid;
		}
		else if(array[mid] > element ) {
			return binarysearch(array,element,start,mid-1);
		}
		else if(array[mid] < element) {
			return binarysearch(array,element,mid+1,end);
		}
		return -1;
	}
}
