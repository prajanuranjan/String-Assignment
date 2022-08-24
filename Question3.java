package Assignment2;
import java.util.Scanner;
public class Question3 {
//Anagram- all the characters of the both words are same
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		str1.toLowerCase();
		String str2=sc.next();
		str2.toLowerCase();
		int m=str1.length();
		int n=str2.length();
		boolean isAnagram=false;
		char c=' ';
		for(int i=0;i<str1.length();i++)
		{
			isAnagram=false;
			c=str1.charAt(i);
			for(int j=0;j<str2.length();j++)
			{
				if(str1.charAt(j) == c)
				{
					isAnagram=true;
					break;
				}
			}
		}
		if(isAnagram)
		    System.out.println("Hence the string is Anagram " + isAnagram);
		else
			System.out.println("Hence the string is not Anagram " + isAnagram);
	}
}
