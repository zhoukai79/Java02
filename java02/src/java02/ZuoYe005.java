package java02;

public class ZuoYe005 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int b=0;b<2*i-1;b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("----------------------------------");
		
		for(int a=1;a<=5;a++) {
			for(int b=a;b<=5;b++) {
				System.out.print(" ");
			}
			for(int b=0;b<2*a-1;b++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
