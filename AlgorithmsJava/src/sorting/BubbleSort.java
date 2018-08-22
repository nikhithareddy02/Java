package sorting;

import java.util.Scanner;

import ds.Array;

public class BubbleSort {
	public static void main(String[] args){
			BubbleSort bs = new BubbleSort();
			Scanner sc = new Scanner(System.in);
			int size = Integer.parseInt(sc.nextLine());
			String ip = sc.nextLine();
			String[] ar = ip.split("\\s+");
			int[] input = new int[size];
			for (int i = 0; i < ar.length; i++) {
				input[i] = Integer.parseInt(ar[i]);
			}
			System.out.println(bs.bubbleSort(input));
			Array.printArray(bs.bubbleSortArray(input));
			sc.close();
	}
	int bubbleSort(int[] input){
		int local,swap=0;
		for (int i = 0; i < input.length-1; i++) {
			for (int j = 0; j < input.length-i-1; j++) {
				if(input[j] > input[j+1]) {
					local = input[j+1];
					input[j+1] = input[j];
					input[j] = local;
					swap += 1;
				}
			}
			if(swap == 0) {
				break;
			}
		}
		return swap;
	}
	public int[] bubbleSortArray(int[] input){
		int local,swap=0;
		for (int i = 0; i < input.length-1; i++) {
			swap = 0;
			for (int j = 0; j < input.length-i-1; j++) {
				if(input[j] > input[j+1]) {
					local = input[j+1];
					input[j+1] = input[j];
					input[j] = local;
					swap += 1;
				}
			}
			if(swap == 0) {
				break;
			}
		}
		return input;
	}
}
