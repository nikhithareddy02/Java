
public class TestGS {
	public static void main(String[] args) {
		int[][] a = new int[2][2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j] = 0;
			}
		}
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		};
	}
}
