package Patterns;

import java.util.Scanner;

public class pattern_B {

	public static void main(String[] args) {

		int n = 7;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=5; j++) {
				if ((j==1)||(i==1&&j<=4)||(i==7&&j<=4)||(i==4&&j<=4)||(j==5&&i>=2&&i<=6&&i!=4)){
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
