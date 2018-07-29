class Count
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0,num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		        while(num != 0)
{
	num=num/10;
	count++;
	
}
	
		System.out.println("number of digits" +count);
	
}	// your code goes here
	
}
