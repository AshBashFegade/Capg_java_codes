import java.util.*;
public class Odd_Even {

	public static void main(String[] args) {
		
		int number=34;
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		if(number%2==0)
		{
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
	
}