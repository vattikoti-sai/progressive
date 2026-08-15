package DSA;

public class pattern3 {

	public static void main(String[] args) {
for(int i=1;i<=5;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("*");
		if(j==5) {
			System.out.println();
			for(int k=4;k>=1;k--) {
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

}
