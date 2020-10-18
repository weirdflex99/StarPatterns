import java.util.*;
public class Right_Triangle_Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<=i;j++)
        	{
        		System.out.print("*"+ " ");
        	}
        	System.out.println();
        }
        s.close();
	}

}
