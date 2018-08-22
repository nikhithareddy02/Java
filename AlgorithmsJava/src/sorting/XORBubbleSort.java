package sorting;

import java.util.Scanner;

public class XORBubbleSort {
	public static void main(String[] args) {
		XORBubbleSort xor = new XORBubbleSort();
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		//String[] s = sc.nextLine().split("\\s+");
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		System.out.println(xor.getcountxor(ar,n));
		sc.close();
	}
	int getcountxor(int[] ar,int n) {
		int count = 0;
		for (int i = 1; i < ar.length+1; i++) {
			for (int j = i; j < ar.length+1; j++) {
				//1<=i<j<=n
				if((i<j&&i>=1&&i<=n&&j>=1&&j<=n) && ((ar[i-1] ^ ar[j-1])==0)) {
					System.out.println("i : "+i+"\tj : "+j+"\tar[i]:"+ar[i-1]+"\tar[j]"+ar[j-1]);
					System.out.println("count:"+count);
		            count += 1;
				}
			}
		}
		return count;
	}
}
