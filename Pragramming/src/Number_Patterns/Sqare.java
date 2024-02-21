package Number_Patterns;

import java.util.Scanner;

public class Sqare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			if(i<=n||j<=n) {
				System.out.print(i);
			}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
