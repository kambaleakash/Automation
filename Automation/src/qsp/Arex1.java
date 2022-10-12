package qsp;

import java.util.Iterator;
import java.util.Scanner;

public class Arex1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int row=sc.nextInt();
		int col= sc.nextInt();
		int mat[][] = new int[row][col];
		System.out.println("enter "+ row*col + " row wise");
		for (int i=0; i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				mat[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("The entered elements are");
		for (int i=0; i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print((mat[i][j])+"    ");
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
