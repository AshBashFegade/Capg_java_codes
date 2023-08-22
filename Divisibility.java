import java.util.Scanner;

public class Divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=45;
        System.out.println("enter the number:");
      	Scanner sc=new Scanner(System.in);
      	num=sc.nextInt();
      	if(num%7==0)
      	{
      		if(num%5==0) {
      			System.out.println("Number is divisible by 7 and 5");
      		}
      	
      	}
      	else
      	{
      		System.out.println("Number is not Divisible by 5 and 7");
      	}
	}

}
