import java.util.Scanner;

public class FindGCDHCF {
	/*
	 * Euclid's Algorithm
	 * Steps: m > n Prerequisite 
	 * 1 . Divide m by n and the reminder is r
	 * 2 . if reminder r = 0 then GCD is a
	 * 3 . Else Go to Step 1 with n = r and m = n 
	 * 4 . Continue till reminder is equal to zero
	 * */
	public int gcd(int m,int n) {
		if(m == 0 || n == 0) {
			return 0;
		}
		return m%n==0?n:gcd(n,m%n);
	}
	public static void main(String[] args) {
		FindGCDHCF f = new FindGCDHCF();
        Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("GCD of "+ a + " and " + b + " is: " + (a > b ? f.gcd(a, b) : f.gcd(b, a)));
		scan.close();
	}
}
