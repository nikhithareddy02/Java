package sorting;

import java.util.Scanner;

import ds.Array;

public class QuickSort {
	public static void main(String[] args) {
		QuickSort q = new QuickSort();
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		String[] ar = ip.split("\\s+");
		int size = ar.length;
		int[] input = new int[size];
		for (int i = 0; i < size; i++) {
			input[i] = Integer.parseInt(ar[i]);
		}
		//starting and ending index
		q.quickSort(input,0,input.length-1);
		Array.printArray(input);
		sc.close();
	}

	private void quickSort(int[] input, int i, int j) {
		// TODO Auto-generated method stub
		
	}
}
