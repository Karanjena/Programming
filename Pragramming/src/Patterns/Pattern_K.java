package Patterns;

public class Pattern_K {

	public static void main(String[] args) {

		int n = 7;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=5; j++) {
				if ((j==1)||(i+j==5+1)||(i-j==n-5)){
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
