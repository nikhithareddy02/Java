package ds;

import java.util.Scanner;

public class BinaryQueriesArray {
	public static void main(String[] args) {
		BinaryQueriesArray BB = new BinaryQueriesArray();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int queries = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		String listofintegers;
		String [] arr ;
		int[] subarray;
		int j,k=0;
		scan.nextLine();
		for (int i = 0; i < queries; i++) {
			listofintegers = scan.nextLine();
			arr = listofintegers.split(" ");
			if(arr.length == 2) {
				if(Integer.parseInt(arr[0]) == 1) {
					array[Integer.parseInt(arr[1])-1] = array[Integer.parseInt(arr[1])-1] == 0 ? 1 : 0;
				}
			}
			if(arr.length == 3) {
				k=0;
				subarray = new int[ Integer.parseInt(arr[2])+1- Integer.parseInt(arr[1])];
				for (j = Integer.parseInt(arr[1])-1; j < Integer.parseInt(arr[2]); j++) {
					subarray[k] = array[j];
					k = k+1;
				} 
				if(BB.BinaryToDecimal(subarray)/2 == 0) {
					System.out.println("EVEN");
				}
				else {
					System.out.println("ODD");
				}
			}
		}
		scan.close();
	}
	int BinaryToDecimal(int[] array) {
		String str = "";
		for (int i = 0; i < array.length; i++) {
			str += array[i];
		}
		return Integer.parseInt(str,2);
	}
}
