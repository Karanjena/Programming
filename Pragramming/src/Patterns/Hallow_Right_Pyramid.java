package Patterns;

import java.util.Scanner;

public class Hallow_Right_Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();

		for (int i = 1; i <= n * 2 - 1; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j || i + j == n * 2||j==1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}