import java.util.Scanner;

public class Reverse_Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int down=s.nextInt();
		for (int i= 0; i<= down-1; i++)  
        {  
        for (int j=0; j<=i; j++)  
        {  
        System.out.print(" ");  
        }  
        for (int k=0; k<=down-1-i; k++)  
        {  
        System.out.print("*" + " ");  
        }  
        System.out.println();  
        }  
        s.close();
	}

}
