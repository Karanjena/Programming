package Char_pattern;
import java.util.Scanner;
public class C_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n;j++) {
				if(i+j<=n+1) {
					System.out.print(ch+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
			ch++;
		}
		sc.close();
	}
}
