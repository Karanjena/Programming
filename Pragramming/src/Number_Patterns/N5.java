package Number_Patterns;

import java.util.Scanner;

public class N5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
			int n=sc.nextInt();
			int num=1;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(i>=j) {
						System.out.print(num+++" ");
					}else {
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			sc.close();
	}
}
