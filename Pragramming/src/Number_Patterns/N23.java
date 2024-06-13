package Number_Patterns;

import java.util.Scanner;

public class N23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int sum = 1;
			for (int j = 1; j <= n * 2 - 1; j++) {
				if (i + j >= n + 1 && j - i <= n - 1) {
					System.out.print(sum+" ");
					if (j < n) {
						sum++;
					}else {
						sum--;
					}
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
