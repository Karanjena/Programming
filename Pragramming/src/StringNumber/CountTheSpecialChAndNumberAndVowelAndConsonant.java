package StringNumber;

import java.util.Scanner;

public class CountTheSpecialChAndNumberAndVowelAndConsonant {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String s=sc.next();
		
		int spc=0;
		int v=0;
		int c=0;
		int num=0;
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					v++;
				}else {
					c++;
				}
				
			}else if(ch>='0'&&ch<='9') {
				num++;
			}else {
				spc++;
			}
		}
		System.out.println(spc);
		System.out.println(v);
		System.out.println(c);
		System.out.println(num);
	}

}
