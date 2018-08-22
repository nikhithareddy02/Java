package sorting;

import java.util.Scanner;

import ds.Array;

/**
 * @author npasula
 * Divide-and-conquer algorithm based on the idea of breaking down a list into several sub-lists until 
 * each sublist consists of a single element and merging those sublists 
 * in a manner that results into a sorted list
 */
public class MergeSort {
	public static void main(String[] args) {
		MergeSort m = new MergeSort();
		Scanner sc = new Scanner(System.in);
		String ip = sc.nextLine();
		String[] ar = ip.split("\\s+");
		int size = ar.length;
		int[] input = new int[size];
		for (int i = 0; i < size; i++) {
			input[i] = Integer.parseInt(ar[i]);
		}
		//starting and ending index
		m.mergeSort(input,0,input.length-1);
		Array.printArray(input);
		sc.close();
	}
	public void mergeSort(int[] input,int start,int end) {
		if(start < end) {
			int mid = (start+end) / 2;
			mergeSort(input,start,mid);
			mergeSort(input,mid+1,end);
			merge(input, start, mid, end);
		}	
	}
	public void merge(int[] input,int start,int mid,int end) {
		//Finding lengths of sub arrays to be merged
		int len1 = mid-start+1;
		int len2 = end-mid;
		
		//creating sub arrays
		int[] arr1 = new int[len1];
		int[] arr2 = new int[len2];
		int i=0,j=0;
		for(i = 0;i<len1;i++) {
			arr1[i] = input[start+i];
		}
		int k=0;
		for(i = 0;i<len2;i++) {
			arr2[i] = input[mid+1+i];
		}
		k = start;
		i=j=0;
		while(i<len1 && j < len2) {
			if(arr1[i] <= arr2[j]) {
				input[k] = arr1[i];
				i++;
			}
			else{
				input[k] = arr2[j];
				j++;
			}
			k++;
		}
		//If there are any elements left in both arrays
		while(i<len1) {
			input[k] = arr1[i];
			i++;
			k++;			
		}
		while(j<len2) {
			input[k] = arr2[j];
			j++;
			k++;			
		}
	}
}
