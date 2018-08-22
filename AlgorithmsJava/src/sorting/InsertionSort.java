package sorting;

import java.util.Scanner;

import ds.Array;

public class InsertionSort {
	public static void main(String[] args){
		InsertionSort bs = new InsertionSort();
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		String ip = sc.nextLine();
		String[] ar = ip.split("\\s+");
		int[] input = new int[size];
		for (int i = 0; i < ar.length; i++) {
			input[i] = Integer.parseInt(ar[i]);
		}
		Array.printArray(bs.insertionSortArray(input));
		sc.close();
}

	private int[] insertionSortArray(int[] input) {
		int temp,j;
		for (int i = 0; i < input.length; i++) {
			temp = input[i];
			j = i;
			for (j = i ; j > 0 ; j--) {
				if(temp > input[j-1]) {
					break;
				}
				input[ j ] = input[ j-1];   
			}
			input[j] = temp;
		}
		return input;
	}
}
