package MatrixArray;

import java.util.*;
public class ProductOfTwoMatrix {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Row and Column size of 1st matrix....");
	int r1=sc.nextInt();
	int c1=sc.nextInt();
	
	System.out.println("Enter the Row and Column size of 2nd matrix....");
	int r2=sc.nextInt();
	int c2=sc.nextInt();
	if(c1==r2) {
		int a[][]=new int [r1][c1];
		int b[][]=new int [r2][c2];
		int c[][]=new int [r1][c2];
		
		System.out.println("Enter the 1st matrix values....");
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Enter 2nd matrix values.....");
		
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<c1;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
				
			}
			
		}
		System.out.println("The Product of 2 matrix is :");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			System.out.println("\n");
		}
		
	}
	else
	{
		System.out.println("Plese enter the 1st matrix columns equal to 2nd matrix rows....");
	}
}
}
