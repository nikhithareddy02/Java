import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CanBePalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(checkPalindrome(str));
		scan.close();
	}
	/*
	 * Checking if the given string can be rearranged to a palindrome
	 * */
	public static boolean checkPalindrome(String s) {
		char ch;
		int count = 0;
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if(m.containsKey(ch)) {
				m.put(ch,m.get(ch)+1); 
			}
			else{
				m.put(ch, 1);
			};
		}
		for(char k : m.keySet()) {
			if(count > 1) {
				return false;
			}
			if(m.get(k) % 2 == 1) {
				count += 1;
			}
		}
		return true;
	}

}
