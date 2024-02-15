package Number;

import java.util.Scanner;

public class Happy_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		while(true) {
			int sum=0;
			while(num>0) {
				int d=num%10;
				sum=sum+(d*d);
				num=num/10;
			}
			if(sum==1) {
				System.out.println("Happy Number");
				break;
			}else if(sum==4) {
				System.out.println("Unhappy Number");
				break;
			}
			num=sum;
		}
	}
}
