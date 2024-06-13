package StringNumber;

import java.util.Scanner;

public class ConvertStringUppercaseToLowerCaseWithoutToLowercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Upper Character");
		String s=sc.next();
		String res="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if (ch>='A'&&ch<='Z') {
				int asic=ch;
				char ch1=(char)(asic+32);
				res=res+ch1;
			} else {

				res=res+ch;
			}
		}
		System.out.println(res);

	}

}
