class Amstrong
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int num,c=0,a,temp;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	temp=num;
	while(num>0)
	{// your code goes here
        
         a=num%10;
         num=num/10;
         c=c+(a*a*a);
}
if(temp==c)
{
	System.out.println("yes");
}

else
{
	System.out.println("no");
}
}
}
