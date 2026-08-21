package DSA;

public class Pattren1 {
	int n;

	void pattern1(int n) {
		System.out.println("pattern 1");

		this.n = n;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n + 1 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void pattern2(int n) {
		System.out.println("pattern 2");
		this.n = n;

		for (int i = 1; i <n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		
		Pattren1 p = new Pattren1();
		p.pattern1(6);
		p.pattern2(6);
		
	}
}
