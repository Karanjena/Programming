package Number_Patterns;

import java.util.Scanner;

public class N25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int n = sc.nextInt();
		int num=1;
		for (int i = 1; i <= n; i++) {
			
			int sum =n+1;
			for (int j = 1; j <= n * 2 - 1; j++) {
				if (i + j >= n + 1 && j - i <= n - 1 && i + j ==sum) {
					System.out.print(num+++" ");
					sum = sum + 2;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}

}
