package StringNumber;

import java.util.Scanner;

public class ReversString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String ");
		String s=sc.next();
		
		String res="";
		
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			res=res+ch;
		}
		System.out.println(res);

	}

}
