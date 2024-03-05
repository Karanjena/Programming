package Number_Patterns;

import java.util.Scanner;

public class N14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--) {
			int sum=1     ;
			for(int j=n;j>=1;j--) {
				if(i+j<=n+1) {
					System.out.print(sum+" ");
					sum++;
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
