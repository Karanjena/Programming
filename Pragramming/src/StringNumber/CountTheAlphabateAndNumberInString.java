package StringNumber;

import java.util.Scanner;

public class CountTheAlphabateAndNumberInString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String s=sc.next();
		int alpha=0;
		int num=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
				alpha++;
				
			}else if(ch>='0'&&ch<='9') {
				num++;
			}
		}
		System.out.println(alpha);
		System.out.println(num);

	}

}
