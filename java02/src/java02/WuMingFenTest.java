package java02;

public class WuMingFenTest {

	public static void main(String[] args) {
		WuMingFen f1 = new WuMingFen("麻辣", 3, true);
		f1.check();
		System.out.println(" ");

		WuMingFen f2 = new WuMingFen("麻辣", 2, false);
		f2.check();
		System.out.println(" ");

		WuMingFen f3 = new WuMingFen("牛肉", 2, true);
		f3.check();
		System.out.println(" ");

	}

}
