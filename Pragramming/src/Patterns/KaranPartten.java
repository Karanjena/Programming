package Patterns;



public class KaranPartten {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((j == 1) || (i + j == 5 + 1) || (i - j == 7 - 5)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 5; j++) {
				if ((i == 1 && j >= 2 && j <= 4) || (j == 1 && i >= 2) || j == 5 && i >= 2 || i == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 5; j++) {
				if (j == 1 || (i == 1 && j <= 4) || (i == 4 && j <= 4) || (i - j == 7 - 5)
						|| (j == 5 && i <= 3 && i >= 2)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for (int j = 1; j <= 5; j++) {
				if ((i == 1 && j >= 2 && j <= 4) || (j == 1 && i >= 2) || j == 5 && i >= 2 || i == 4) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");           
			for (int j = 1; j <= 7; j++) {
				if (j == 1 || j == 7 || i == j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		

	}

}
