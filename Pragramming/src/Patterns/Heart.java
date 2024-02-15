package Patterns;

import java.util.Scanner;

public class Heart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number");
		int num = sc.nextInt();

		for (int i = num / 2; i <= num; i +=2) {
			for (int j = 1; j < num - i; j +=2) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= num - i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = num; i >= 1; i--) {
			for (int j = 1; j <= num*2-1; j++) {
			if(i+j>=num+1 && j-i<=num-1) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}