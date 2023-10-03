import java.util.*;
public class Array_Assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
       int[][] arr=new int[][]{
    	   {1,2},{3,4}
    	   };
    	   System.out.println("elements are :");
    	   for(int[]i :arr) {
    		  for(int j :i) {
    			  System.out.print(" " + j);
    		  }
    		  System.out.println(" ");
    	   }
    	   System.out.println("elements are :");
    	   
    	   for(int i=0;i<2;i++)
    	   {
    		   for(int j=0;j<2;j++)
    		   {
    			   System.out.print(" "+ arr[i][j]);;
    		   }
    		   System.out.println(" ");
    	   }
    	   for(int i=0;i<2;i++)
    	   {
    		   for(int j=0;j<2;j++)
    		   {
    			   sum+=arr[i][j];
    		   }
    	   }
    	   System.out.println("sum is " + sum);
       
	}

}
