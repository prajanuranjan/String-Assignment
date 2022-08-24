package Assignment2;

import java.util.Scanner;

public class CountVowelConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0, cons=0; 
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
			{
				count++;
			}
			else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				cons++;
			}
				
		}
		System.out.println("No of Vowels " + count);
		System.out.println("No of consonants" + cons);
	}

}
