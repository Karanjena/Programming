package Number;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=sc.nextInt();
		int sum=0;
		int copy=n;
		while(n!=0) {
			int r=n%10;  
			sum=(sum*10)+r;
			n=n/10;
		}
		if(sum==copy) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		sc.close();
	}
}
