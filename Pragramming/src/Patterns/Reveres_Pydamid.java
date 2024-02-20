package Patterns;

import java.util.Scanner;

public class Reveres_Pydamid {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n*2-1;j++) {
				if(i<=j&&i+j<=n*2) {
					Thread.sleep(1500);
					System.out.print("* ");
				}else {
					Thread.sleep(1500);
					System.out.print("  ");
				}
			}
			Thread.sleep(1000);
			System.out.println();
		}
		sc.close();
	}
}
