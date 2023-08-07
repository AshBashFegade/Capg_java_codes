import java.time.LocalDate;  
import java.time.Period;  
import java.util.Scanner;  
class emp
{
    float DA,TA,HRA;
	public int calculateAge(LocalDate dob)   
	{  
		
		LocalDate curDate = LocalDate.now();  
		  
		if ((dob != null) && (curDate != null))   
		{  
		    return Period.between(dob, curDate).getYears();  
		}  
		else  
		{  
		    return 0;  
		}  
		}
	public void allowance(float salary)
	{
			
		DA=0.02f*salary;
		TA=0.01f*salary;
		HRA=0.03f*salary;
		System.out.println("Darrance allowance is"+DA);
		System.out.println("Travelling allowance is"+TA);
		System.out.println("Home Rental allowance is"+HRA);
			
			
	}
	public void calculatePa(float salary) 
	{
		float PA;
		PA=0.5f *salary;
		System.out.println("PA for employee is"+PA);
	}
	public float totalSal(float salary)
	{
		float totalSal;
		int tax=1000;
		if(salary<10000)
		{
			totalSal=salary+HRA+TA+DA;
		}
		else 
		{
			totalSal=salary+HRA+TA+DA-tax;
		}
		return totalSal;
	}
	public int retireAge(LocalDate dob)
	{
		LocalDate curDate = LocalDate.now(); 
		int age=Period.between(dob, curDate).getYears();  
		System.out.println("age of employee is "+age);
		int retAge;
		int limit=55;
		retAge=limit-age;
		return retAge;
	}
}
public class Employee
{
	public static void main(String args[])   
	{  
		emp e=new emp();
		float salary;
		int ch;
		char choice='y';
	    System.out.print("Enter date of birth of employee in YYYY-MM-DD format: ");  
	    Scanner scanner = new Scanner(System.in);  
	
	    String input = scanner.nextLine();  

	    LocalDate dob = LocalDate.parse(input);
	    if( (e.calculateAge(dob)>18)&&(e.calculateAge(dob)<55))
	    {
			System.out.println("Enter Basic payment of employee");
	    	salary=scanner.nextFloat();
	        while(choice !='n') {	
	    	    System.out.println("************Menu**************");
	    	    System.out.println("");
	    	    System.out.println("");
	            System.out.println("1.All Allowances for employee");
	            System.out.println("2.Employee is eligible for pa or not?");
        	    System.out.println("3.Total salary of employee");
        	    System.out.println("4.Emploee's retirement age");
        	    System.out.println("Enter Your Choice");
        	    ch=scanner.nextInt();
	            switch(ch)
	            {
	                case 1:
		                e.allowance(salary);
		                break;
	
	                case 2:
		                if(salary>10000)
		                {
    		                e.calculatePa(salary);
		                }
		                else 
		                {
			                System.out.println("Employee is not eligible for PA");
		                }
		                break;
	                case 3:
		                System.out.println("Total Monthly Salary of an employee is"+e.totalSal(salary));
		                break;
	                case 4:
		                System.out.println("Employee gets retired in" + e.retireAge(dob));
		                break;
	                default :
		                System.out.println("Enter correct choice");
	            }
	            System.out.println("Do you want to continue?(y/n)");
	            choice=scanner.next().charAt(0);
	    }
    }
	 
	
   }  
}  
	

