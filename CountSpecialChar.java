package Assignment2;

import java.util.Scanner;

public class CountSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i)))
				count++;
		}
		if(count == 0)
			System.out.println("No Special Characters found");
		else
			System.out.println("No of Special characters " + count);
	}
}
