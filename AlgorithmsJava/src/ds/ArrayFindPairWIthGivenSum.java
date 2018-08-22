package ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayFindPairWIthGivenSum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input Array Elements");
		String str = br.readLine();
		String[] arrayStr = str.split(" ");
		int[] array = new int[arrayStr.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(arrayStr[i]);
		}
		Arrays.sort(array);
		Array.printArray(array);
		System.out.println("Provide Sum to find pair of elements");
		int sum = Integer.parseInt(br.readLine());
		System.out.println(findPair(array,sum));
	}
	public static String findPair(int[] array,int sum) {
		int start = 0,end = array.length-1;
		while(start < end) {
			if(array[start]+array[end] == sum) {
				return array[start]+"    "+array[end];
			}
			else if(array[start]+array[end] > sum) {
				end--;
			}
			else if(array[start]+array[end] < sum) {
				start++;
			}
		}
		return "Not Found";
	}
}
