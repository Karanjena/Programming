package Char_pattern;
import java.util.Scanner;
public class C_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=n;j++) {
				if(i+j>=n+1) {
					System.out.print(ch+++" ");
				}else {
					System.out.print("  ");
		  		}
			}
			System.out.println();
			
		}
		sc.close();
	}
}
