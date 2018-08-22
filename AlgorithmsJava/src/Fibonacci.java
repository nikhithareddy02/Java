import java.util.Scanner;

import ds.Array;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Fibonacci f = new Fibonacci();
		int number = Integer.parseInt(sc.nextLine());
		Array a = new Array();
		a.printArray(f.fibonacci(number));
		f.printFibonacci(number);
		sc.close();
	}
	//Print first n fibonacci numbers
	//Dynamic Programming
	//Time O(n) and space O(n)
	public int[] fibonacci(int n) {
		int[] array = new int[n];
		array[0] = 1;
		array[1] = 1;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i-2] + array[i-1];
		}
		return array;
	}
	//Reducing space complexity
	public void printFibonacci(int n) {
		int a=1,b=1,temp=0;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 2; i < n; i++) {
			System.out.print((a+b) + " ");
			temp = b;
			b = a+b;
			a = temp;
		}
	}
}
