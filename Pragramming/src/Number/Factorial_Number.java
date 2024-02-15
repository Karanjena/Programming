package Number;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		int fact=1;
		for(int i=num; i>=1;i--) {
			fact=fact*i;
		}
			System.out.println(fact);
			sc.close();
	}
}
