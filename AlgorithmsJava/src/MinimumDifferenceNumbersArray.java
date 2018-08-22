import java.util.Scanner;

import sorting.BubbleSort;

public class MinimumDifferenceNumbersArray {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		MinimumDifferenceNumbersArray m = new MinimumDifferenceNumbersArray();
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		String[] ar = ip.split("\\s+");
		int[] input = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			input[i] = Integer.parseInt(ar[i]);
		}
		//Sort array before printing elements 
		BubbleSort bb = new BubbleSort();
		input = bb.bubbleSortArray(input);
		System.out.println("Minimum difference is " + m.findDiff(input));
		sc.close();
	}
	public static int findDiff(int[] array) {
		int diff = Integer.MAX_VALUE;
		int j=0;
		for (int i = 0; i < array.length; i++) {
			for (j = i+1; j < array.length; j++) {
				//diff = array[i] > array[j] &&  array[i] - array[j] < diff ? array[i] - array[j] :(array[j] > array[i] &&  array[j] - array[i] < diff ? array[j] - array[i] : diff) ;
				/*if(array[i] > array[j] && array[i] - array[j] < diff) {
					diff = array[i] - array[j];
				}
				if(array[j] > array[i] && array[j] - array[i] < diff) {
					diff = array[j] - array[i];
				}*/
				if(Math.abs(array[i] - array[j]) < diff) {
					diff = Math.abs(array[i] - array[j]);
				}
			}
		}
		//print elements with minimum difference in ascending order
		for (int i = 0; i < array.length; i++) {
			for (j = i+1; j < array.length; j++) {
				if(Math.abs(array[i] - array[j]) == diff) {
					System.out.println(array[i] + " " + array[j]);
				}
			}
		}
		return diff;
	}
}
