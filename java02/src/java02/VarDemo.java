package java02;

public class VarDemo {

	public static void main(String[] args) {
		byte b = 127;
		int age = 1888888888;
		long l = 1000;
		l = 99L;
		l = 88l;
		
		float f = 99;
		double d = 100.99;
		d = 100d;
		
		boolean isMarried = true;
		isMarried = false;
		
		char c = 'a';
		c = '中';
		
		String s = "Hi...";
		System.out.println(b+""+age+""+l+""+f+""+d+""+isMarried+""+c+""+s);
		
		System.out.println((age+l));
		System.out.println(age+l);
		System.out.println(""+age+l);
		System.out.println(""+(age+l));

	}

}
