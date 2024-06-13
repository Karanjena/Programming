package StringNumber;
import java.util.*;
public class SstringPalandromorNotUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String s=sc.next();
		String res="";
		int temp=0;
		int temp1=s.length()-1;
		
		boolean flag=false;
		
		while(temp<temp1) {
			if(s.charAt(temp)==s.charAt(temp1)) {
				flag=true;
				temp++;
				temp--;
				
			}else {
				flag=false;
				break;
			}
		}
		if (flag==true) {
			System.out.println("Palandrome");
		} else {

			System.out.println("Not Palandraome");
		}
	}

}
