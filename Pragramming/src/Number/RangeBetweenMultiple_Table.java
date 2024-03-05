package Number;

import java.util.Scanner;

public class RangeBetweenMultiple_Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The 1st Number");
		int a=sc.nextInt();
		System.out.println("Enter The last Number");
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++) {
			int mal=i ;
			for(int j=1;j<=10;j++) {
				int mult=mal*j;
				System.out.println(mal + "*" + i + "=" + mult);
			}
		}
		sc.close();
	}
}
