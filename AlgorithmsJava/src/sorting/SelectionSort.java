package sorting;

import java.util.Scanner;

import ds.Array;


public class SelectionSort {
	
	public static void main(String[] args) {
		SelectionSort s = new SelectionSort();
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		String ip = sc.nextLine();
		String[] ar = ip.split("\\s+");
		int[] input = new int[size];
		for (int i = 0; i < ar.length; i++) {
			input[i] = Integer.parseInt(ar[i]);
		}
		Array.printArray(s.selectionSort(input));
		sc.close();
	}
	public int[] selectionSort(int[] array) {
		int i,j,temp,min = 0;//Min is to maintain minimum value index	
		for(i = 0 ; i < array.length ; i++) {
			min = i;
			for(j = i ; j < array.length ; j++) {
				if(array[min] > array[j]) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

	public int findMinInArray(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			min = min < array[i] ? min : array[i];
		}
		return min;
	}
	public int[] swapArrayElements(int[] array,int i,int j) {
		int temp = array[j];
		array[j] = array[i];
		array[i] = temp;
		return array;
	}
	}
