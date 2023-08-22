import java.util.Scanner;

public class Odd_Even1 {
    public static void main(String args[])
    {
    	int number=34;
    	System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
    	switch(number%2)
    	{
    	case 0:
    		System.out.println("Even number");
    		break;
    	case 1:
    		System.out.println("Odd number");
    		break;
    	default:
    		System.out.println("enetr correct number");
    		
    		
    	}
    }
}
