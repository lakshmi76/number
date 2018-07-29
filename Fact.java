class Fact
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
  int i,fact=1; 
  int number;
  Scanner sc=new Scanner(System.in);
  number=sc.nextInt();
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of number+ is: "+fact);    
 }  
	// your code goes here
	
}
