package StringNumber;

import java.util.Scanner;

public class StringPalandrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String ");
		String s=sc.next();
		String res="";
		
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			res=res+ch;
		}
		if (res.equals(s)) {
			System.out.println("Palandrrome");
		} else {

			System.out.println("Not Palandrome");
		}

	}

}
