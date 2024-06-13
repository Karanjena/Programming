package StringNumber;

import java.util.Scanner;

public class ConvertStringLowerCaseToUppercaseWithoutToLowercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Lower Character");
		String s=sc.next();
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if (ch>='a'&&ch<='z') {
				int asic=ch;
				char ch1=(char)(asic-32);
				res=res+ch1;
			} else {

				res=res+ch;
			}
		}
		System.out.println(res);

	}

}
