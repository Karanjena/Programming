package Number;

import java.util.Scanner;

public class SumOfTheRangeBetweenPrime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st The Number");
		int a = sc.nextInt();
		System.out.println("Enter The Last Number");
		int b = sc.nextInt();
		int sum = 0;
		for (int i = a; i <= b; i++) {
			int n = i;
			int count = 0;

			for (int j = 1; j <= n; j++) {
				if (n % j == 0) {
					count++;

				}
			}
			if (count == 2) {
				sum = sum + n;

			}
		}
		System.out.println(sum);
		sc.close();
	}
}
