import java.util.Scanner;
public class sample {

	public static void main(String[] args) {
		int choice;
		int num1,num2,result;
		char ch='y';
		Scanner sc=new Scanner(System.in);
		
		
        while(ch!='n') {
        	
        	System.out.println("enter two numbers");
    		num1=sc.nextInt();
    		num2=sc.nextInt();
    		System.out.println("***************menu****************");
    		System.out.println("1.Addition");
    		System.out.println("2.Substraction");
    		System.out.println("3.Multiplication");
    		System.out.println("4.Division");
		System.out.println("Enter Your Choice");
//		Scanner sc1=new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			result=num1+num2;
			System.out.println("result is:"+ result);
			break;
		case 2:
			result=num1-num2;
			System.out.println("result is:"+ result);
			break;
		case 3:
			result=num1*num2;
			System.out.println("result is:"+ result);
			break;
		case 4:
			if(num2!=0)
			{
			result=num1/num2;
			System.out.println("result is:"+ result);
			}
			else {
				System.out.println("Division is not possible");
			}
			break;
		default :
			System.out.println("enter correct choice");

	   }
		System.out.println("Do you want to continue?(y/n)");
		ch=sc.next().charAt(0);
        }		
		
		
}
}
