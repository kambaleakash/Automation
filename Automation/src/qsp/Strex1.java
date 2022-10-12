package qsp;

import java.util.Scanner;

public class Strex1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		
		
		char ch[] =	s.toCharArray();
		String str=""+ch[0];
		for(int i=1;i<ch.length;i++)
		{
			
			if(ch[i]!=ch[i-1])		
				
			{
					str=str+ch[i];
			}
			else
			{
				str=str;
			}
		}
		System.out.println(str);
		
	}
	

}
