import java.util.Scanner;

public class RecursionExamples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = Integer.parseInt(sc.nextLine());
		for (int i = 0; i <= number; i++) {
			System.out.println("Factorial of " + i + " : " + factorial(i));
		}
		System.out.println("Provide array elements");
		String ip = sc.nextLine();
		String[] ar = ip.split("\\s+");
		int[] input = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			input[i] = Integer.parseInt(ar[i]);
		} 
		System.out.println(checkIfArrayIsSorted(input, input.length-1) ? "Array is sorted!!!" : "Array is not sorted!!!");
		sc.close();
	}
	public static int factorial(int n) {
		return n == 0 || n == 1 ? n : n*factorial(n-1);
	}
	public static boolean checkIfArrayIsSorted(int[] array,int i) {
		return i == 0 ? true : (array[i] < array[i-1] ? false : checkIfArrayIsSorted(array, i-1));
	}
	public static int fact(int i,int result) {
		if(i == 0) {
			return result;
		}
		else {
			return i*fact(i-1, result);
		}
	}
}
