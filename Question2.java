package Assignment2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s[]=new String[str.length()];
		s=		str.split("\\s");
		String revString="";
		for(int i=0;i<s.length;i++)
		{
			String word=s[i];
			String revWord = " ";
		for(int j=0;j<word.length();j++)
		{
			revWord=word.charAt(j) + revWord;
		}
		revString = revString + revWord + " ";
	  }
		System.out.println(revString);
	}

}
