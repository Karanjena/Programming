package Number_Patterns;

import java.util.Scanner;

public class N1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		
		for(int i=01;i<=n;i++) {
			for(int j=01;j<=n;j++) {
				System.out.print(j);
				}
			System.out.println();
		}
	}
}