package Number_Patterns;

import java.util.Scanner;

public class N3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		int num=0;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
			System.out.print(num++ +"  ");
		}
			System.out.println();
	}
	}
}
