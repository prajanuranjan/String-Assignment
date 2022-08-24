package Assignment2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.replace(" ","");
		char arr[]=s.toCharArray();
		char ch=' ';
		int count=0;
		for(int i=0;i<arr.length;i++)
		{	count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
					//set the 
					arr[j]=' ';
				}
			}
			if(count>1 && arr[i] != ' ')
				System.out.print(arr[i] + " ");	
		}
	}
}
