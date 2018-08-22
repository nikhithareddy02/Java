package ds;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arrayStr = str.split(" ");
		int[] array = new int[arrayStr.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(arrayStr[i]);
		}
		printArray(array);
		ReverseArray(array);
		printArray(array);
	}
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	public static void ReverseArray(int[] array) {
		int start = 0,end = array.length-1;
		int temp;
		while(start<end) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
}
