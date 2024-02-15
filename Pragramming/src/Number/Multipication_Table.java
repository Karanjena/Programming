package Number;

import java.util.Scanner;

public class Multipication_Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int mult=num*i;
			System.out.println(num+"*"+i+"="+mult);
		}
		sc.close();
	}
}
