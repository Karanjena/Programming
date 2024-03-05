package Number_Patterns;
import java.util.Scanner;
public class N20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int sum=i;
			for(int j=1;j<=n;j++) {
			System.out.print(sum+" ");
			sum=sum+n;
				
			}
			System.out.println();
		}
	}
}
