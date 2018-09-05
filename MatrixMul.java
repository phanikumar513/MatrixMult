//matrix multiplication
import java.util.*;
public class MatrixMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		int r1,r2,c1,c2,i,j,k;
		System.out.println(" the no of rows in 1st matrix :");
		r1=obj.nextInt();
		System.out.println("Enter the no of columns in 1st matrix :");
		r2=obj.nextInt();
		System.out.println("Enter the no of rows in 2nd matrix :");
		c1=obj.nextInt();
		System.out.println("Enter the no of columns in 2nd matrix :");
		c2=obj.nextInt();
		int [][]a=new int[r1][c1];
		int [][]b=new int[r2][c2];
//reading matrix 1 values
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.println("Enter the value of "+i+j+" 1st matrix's :");
				a[i][j]=obj.nextInt();
			}
		}
//reading matrix 2 values
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.println("Enter the value of "+i+j+" 1st matrix's :");
				b[i][j]=obj.nextInt();
			}
		}
		
		if(r1!=c2)
		{
			System.out.println("Matrix multipulication is not possible!!");
		}
		else
		{
			System.out.println("Matrix multipulication is possible!!");
		}
//printing 2 matrices
		System.out.println("1st matrix is :");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("2nd matrix is :");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
//matrix multiplication
		int[][]c=new int[r1][c2];
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				for(k=0;k<c1;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("multipulication matrix is :");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
