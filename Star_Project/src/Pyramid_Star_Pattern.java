import java.util.Scanner;

public class Pyramid_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        int row=input.nextInt();
        for(int i=0;i<row;i++ )
        {
        	for(int k=0;k<row-i-1;k++)
        	{
        		System.out.print(" ");
        	}
        	for(int j=0;j<=i;j++)
        	{
        		System.out.print("*"+" ");
        	}
        	System.out.println();
        }
        input.close();
	}

}
