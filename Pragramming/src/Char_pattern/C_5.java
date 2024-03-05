package Char_pattern;
import java.util.Scanner;
public class C_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
			int sum=i;
			for(int j=1;j<=n;j++) {
				System.out.print(ch++ +" ");
				sum=sum+n;
			}
			System.out.println();
			
		}
		sc.close();
	}
}
