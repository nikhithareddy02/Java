import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("\tNon Recursion\t");
		printPrimeNumbersNonRecursive(num);
		System.out.println("\tRecursion\t");
		printPrimeNumbersRecursive(num);
		scan.close();
	}
	//Printing first n Prime numbers 
	public static void printPrimeNumbersNonRecursive(int n) {
		int i = 0,num=2;
		while(i<n) {
			if(checkPrimeNumber(num)) {
				System.out.println(num);
				i++;
			}
			num++;
		}
	}
	public static Boolean checkPrimeNumber(int num) {
		int j;
		for (j = 2; j*j <= num; j++) {
			if(num%j == 0) {
				return false;
			}
		}
		return true;
	}
	//Printing first n Prime numbers
	public static void printPrimeNumbersRecursive(int n) {
		int i = 0,num=2;
		while(i<n) {
			if(checkPrimeRecursive(num,2)) {
				System.out.println(num);
				i++;
			}
			num++;
		}
	}
	public static Boolean checkPrimeRecursive(int num,int i) {
		if(num < 2) {
			return false;
		}
		if(num == 2) {
			return true;
		}
		if(num % i == 0) {
			return false;
		}
		if(i*i > num) {
			return true;
		}
		return checkPrimeRecursive(num, i+1);
	}
}
