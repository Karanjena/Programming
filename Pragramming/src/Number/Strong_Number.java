package Number;

import java.util.Scanner;

public class Strong_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();
		int sum = 0;
		int copy = num;
		while (num > 0) {
			int d = num % 10;
			int factorial = 1;
			for (int i = d; i >= 1; i--) {
				factorial = factorial * i;

			}
			sum = sum + factorial;
			num = num / 10;

		}
		if (sum == copy) {
			System.out.println("It is a Strong Number");
		} else {
			System.out.println("It is Not Strong Number");
		}
		sc.close();
	}
}
