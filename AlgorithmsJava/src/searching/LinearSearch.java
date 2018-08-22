package searching;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		Scanner scan = new Scanner(System.in);
		String listofintegers = scan.nextLine();
		String[] arr = listofintegers.split(" ");
		int size = Integer.parseInt(arr[0]);
		int element = Integer.parseInt(arr[1]);
		listofintegers = scan.nextLine();
		arr = listofintegers.split(" ");
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = Integer.parseInt(arr[i]);
		}
		System.out.println(ls.lastoccurence(array, element));
		scan.close();
	}
	public int lastoccurence(int[] array,int element) {
		int lastocc = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] == element) {
				lastocc = i+1;
			}
		}
		return lastocc;
	}
}
