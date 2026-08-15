package DSA;

public class pattern3 {
	void show(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				if(j==n) {
					System.out.println();
					for(int k=n-1;k>=1;k--) {
						for(int z=1;z<=k;z++) {
							System.out.print("*");
						}
						System.out.println();
					}
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern3 p= new pattern3();
		p.show(7);
	}

}
