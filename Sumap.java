

import java.util.*;
import java.lang.*;
import java.io.*;


 class SumofAP {
public static void main(String[] arg)
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n(number of terms), common difference and  firstterm");
    int a=sc.nextInt(),d=sc.nextInt(),n=sc.nextInt();
    System.out.print("Sum: "+n*(2*a+(n-1)*d)/2);
    }
}
