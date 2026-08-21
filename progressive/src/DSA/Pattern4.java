package DSA;

public class Pattern4 {
	void show(char c) {
		for(char i='A';i<=c;i++) {
			for(char j='A';j<=i;j++) {
				
				System.out.print(j);
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pattern4 p4 = new Pattern4();
		p4.show('F');
	}

}
