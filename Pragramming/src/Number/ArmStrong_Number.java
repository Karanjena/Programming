package Number;

import java.util.Scanner;

public class ArmStrong_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
			
		}
		int copy=n;
		while(n>0) {
			int d=n%10;
			int pow=1;
			for(int i=1;i<count;i++) {
				pow=pow*d;
			}
			sum=sum+pow;
			n=n/10;
		}
		if(sum==copy) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not Armstrong");
		}
	}
}
