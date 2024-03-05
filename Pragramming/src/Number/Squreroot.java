package Number;

import java.util.Scanner;

public class Squreroot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		boolean a = false;
		for (int i = 1; i <= n; i++) {
			if (i * i == n) {
				a=true;
				System.out.println(i);
				break;
			}

		}
		if (a == false) {
			System.out.println("Not Root");
		}
		sc.close();
	}
}
