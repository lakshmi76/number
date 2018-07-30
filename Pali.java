/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class pali{
	public static void main (String[] args) throws java.lang.Exception
	{
		

        int num ,reversedInteger = 0, remainder, originalInteger;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        originalInteger = num;

        // reversed integer is stored in variable
        for( ;num != 0; num /= 10 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
        }

                if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " yes");
else
            System.out.println(originalInteger + " no");

// your code goes here
	}
}
