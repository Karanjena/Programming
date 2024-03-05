package Number_Patterns;

import java.util.Scanner;

public class N11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				if(i<=j) {
					System.out.print(i+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
