package Assignment2;

import java.util.Scanner;
//String is Pangram - all the alphabets are present
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean pan=isPangram(s.toLowerCase());
		if(pan)
			System.out.println("the given string is Pangram");
		else
			System.out.println("the given string is not Pangram");
	}

	private static boolean isPangram(String s) {
		// TODO Auto-generated method stub
		if(s.length() < 26)
			return false;
		else {
			for(char c='a';c<='z';c++)
			{
				for(char ch : s.toCharArray())
				{
					if(ch==' ')
						continue;
					if(c==ch)
						return true;
				}
			}
		return false;
		}
	}

}
