package Number_Patterns;
import java.util.Scanner;

public class N17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		int sum=1;
		for(int i=1;i<=n*2-1;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j>=n+1&&i-j<=n-1) {
					System.out.print(sum+++" ");
					
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
