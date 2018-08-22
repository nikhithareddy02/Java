public class Test {
	static int a;
	public Test(int a) {
		this.a = a;
	}
	public static void main(String[] args) throws InterruptedException {

		/*		System.out.print("test");
		System.out.print("\f");
		System.out.println("test again");
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		int[] ar = {1,2,3,4,5};
		String str = new String(helloArray);
		System.out.println(str);
		System.out.println(str.getBytes());*/
		/*System.out.println(new Date( ) + "\n"); 
        Thread.sleep(10*60*10); 
        System.out.println(new Date( ) + "\n"); 
		 */
        boolean visited[] = new boolean[5];
        for (int i = 0; i < visited.length; i++) {
			System.out.println(visited[i]);
		}
		//Testing static variables
		Test t1 = new Test(1);
		System.out.println(t1.a);
		System.out.println(Test.a);
		Test t2 = new Test(2);
		Test t3 = null;
		System.out.println(t2.a);
		System.out.println(t3.a);
		System.out.println(Test.a);
		Object a = null;
		Object b = null;
		System.out.println(a==b);
		System.out.println(b==a);
		int aint = 1;
		System.out.println(aint++);
		System.out.println(aint);
		aint = 1;
		System.out.println(++aint);
		System.out.println(aint);
		int x = 1;
		int y = 0;
		y = x++;
		System.out.println(y);
		x=1;
		y = ++x;
		System.out.println(y);
		System.out.println(System.getProperty("user.dir"));
		try {
			int[] array = {1,2,3};
			System.out.println(array[4]);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
