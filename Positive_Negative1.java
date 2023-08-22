import java.util.*;

public class Positive_Negative1 {
    public static void main(String args[])
    {
    	int num=45;
    	  
    	 System.out.println("enter the number:");
 		Scanner sc=new Scanner(System.in);
 		num=sc.nextInt();
 		switch((num >> 31) & 1)
 		{
 		case 0:
            System.out.println("positive");
            break;
 		case 1:
 			System.out.println("Negative");
            break;
 			
 			
 		}
    }
}
