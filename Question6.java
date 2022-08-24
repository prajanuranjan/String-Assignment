package Assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char charArray[] = s.toCharArray();
		int n=charArray.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1-i;j++)
			{
				if(charArray[j] > charArray[j+1])
				{
					int temp=charArray[j];
					charArray[j] = charArray[j+1];
					charArray[j+1] = (char) temp;
				}
			}
		}
		System.out.print("the Sorted string is : " + Arrays.toString(charArray));
	}
}
