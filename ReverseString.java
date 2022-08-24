package Assignment2;
import java.util.Scanner;
public class ReverseString {
	
	public static String reversedString(String str)
	{	String rev=" ";
		str=str+" ";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != ' ')
			 
			 rev=str.charAt(i)+rev;
		}
		return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String rev=reversedString(str);
		System.out.println(rev);
	}

}
