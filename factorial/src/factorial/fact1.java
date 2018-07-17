package factorial;

public class fact1 {
	
int var;
	

	

	public fact1(int var) {
		this.var = var;
	}

	public fact1()
	{
		var=0;
	}

	public static void calc(int num) { 
		
		int i,fact=1;  
		
	   
	 for(i=1;i<=num;i++){    
	      fact=fact*i;    
	  }    
	  System.out.println("Factorial of "+num+" is: "+fact);    

}
}
