package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 29; 
		// int nums ;
	     //boolean flag=  false;        
		  //nums=num/2;       
		   for(int i=2;i<=num-2;i++){      
		    if(num%i==0){      
		     System.out.println(num+" is not prime number");      
		    // flag= true;      
		     break;      
		    }       
		   else {
			   System.out.println(num + "  is prime number");
			   break;
		   }
		   }
		 //  if (!flag)  { System.out.println(num+" is prime number"); }  
	    } 
	  }
	


