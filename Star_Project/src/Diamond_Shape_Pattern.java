import java.util.Scanner;

public class Diamond_Shape_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
        int row=input.nextInt();
        int down=row-1;;
        for (int j = 1; j<= row; j++)  
        {  
        for (int i = 1; i<= down; i++)  
        {  
        System.out.print(" ");  
        }  
        down--;  
        for (int i = 1; i <= 2 * j - 1; i++)  
        {  
        System.out.print("*");  
        }  
        System.out.println("");  
        }  
        down = 1;  
        for (int j = 1; j<= row - 1; j++)  
        {  
        for (int i = 1; i<= down; i++)  
        {  
        System.out.print(" ");  
        }  
        down++;  
        for (int i = 1; i<= 2 * (row - j) - 1; i++)  
        {  
        System.out.print("*");  
        }  
        System.out.println("");  
	}
        
        
        input.close();
	}

}
