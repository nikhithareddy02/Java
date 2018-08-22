package ds;

public class Library {
	public static void main(String[] args) {
		/*System.out.println(power(2,0));
		System.out.println(power(2,1));
		System.out.println(power(2,2));
		System.out.println("Using Math library");
		System.out.println(powerUsingMath(2,0));
		System.out.println(powerUsingMath(2,1));
		System.out.println(powerUsingMath(2,2));
		System.out.println("Root");*/
		 charCount("String str");
	}
	//Below function result a^b
	public static int power(int a,int b) {
		int res = 1;
		for (int i = 1; i <= b; i++) {
			res = res*a;
		}
		return res;
	}
	//Function to find power using Math Library
	public static int powerUsingMath(int a,int b) {
		return (int)(Math.pow(a, b));
	}
	//FUnction to count character occurrences in String
	public static void charCount(String str) {
	    final int MAX_CHAR = 256;
        int count[] = new int[MAX_CHAR];
        int len = str.length();
	    for (int i = 0; i < len; i++) {
	    	System.out.println(str.charAt(i));
            count[str.charAt(i)]++;
	    }
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i) + " : " + count[str.charAt(i)]);
		}
		
	}
}
