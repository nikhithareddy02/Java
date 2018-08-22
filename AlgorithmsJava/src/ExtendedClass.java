
class Inheritance {
	private void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
}
public class ExtendedClass extends Inheritance{
	void print(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}
	void print(int[] array) {
		System.out.println("From child class");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\n");
		}
	}
	static {
		ExtendedClass e = new ExtendedClass();
		int[] ar = {1,2,4,5};
		e.print(ar);
	}
	public static void main(String[] args) {
		
	}
}
