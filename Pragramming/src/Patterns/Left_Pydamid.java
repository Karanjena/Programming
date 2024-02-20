package Patterns;

import java.util.Scanner;

public class Left_Pydamid {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();

		for (int i = 1; i <= n * 2 - 1; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j >= n + 1 &&i-j <= n -1) {
					Thread.sleep(300);
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
