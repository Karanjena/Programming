package Number_Patterns;

import java.util.Scanner;

public class N8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i >= j) {
					if (j % 2 == 0) {
						System.out.print(0 + " ");
					} else {
						System.out.print(1 + " ");
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
