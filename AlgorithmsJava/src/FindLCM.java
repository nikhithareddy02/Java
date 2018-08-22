
public class FindLCM {
	public static void main(String[] args) {
		
	}
	static int findLCM(int[] array,int lcm,int n) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] % n != 0 ? array[i] : array[i] % n; 
		}
		return findLCM(array,lcm,n+1);
	}
}
