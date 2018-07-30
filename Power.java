

import java.util.*;
import java.lang.*;
import java.io.*;

class Power
{
	public static void main (String[] args) throws java.lang.Exception
	{
		

   

        int base , exponent ;
        Scanner sc=new Scanner(System.in);
        base= sc.nextInt();
        exponent=sc.nextInt();
        double result = Math.pow(base, exponent);

        System.out.println("Answer = " + result);// your code goes here
	}
}
