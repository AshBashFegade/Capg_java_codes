import java.util.*;
public class Positive_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=2;
        System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("Positive number");
			
		}
		else if(num==0){
			System.out.println("Neutral Number");
		}
		else {
			System.out.println("Negative Number");
		}
	}

}
