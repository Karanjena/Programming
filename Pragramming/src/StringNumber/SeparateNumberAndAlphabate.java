package StringNumber;

import java.util.Scanner;

public class SeparateNumberAndAlphabate {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		
		String s=sc.nextLine();
		String alpha="";
	String num="";
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				alpha=alpha+ch;
				
			}else if(ch>='0'&&ch<='9') {
				num=num+ch;
			}
		}
		System.out.println(alpha+num);
		

	}

}
