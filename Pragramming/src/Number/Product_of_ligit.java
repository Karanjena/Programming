


package Number;

import java.util.Scanner;

public class Product_of_ligit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);


		int num=sc.nextInt();
	
	int product=1;
	
	while(num>0) {
		int d=num%10;
		product=product*d;
		num=num/10;
	}
	System.out.println(product);
	sc.close();
	}
}
