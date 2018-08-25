
 import java.util.*; 
 import java.lang.*; 
  import java.io.*; 
 import java.util.Scanner; 
  class Strnu 
  { 
  	public static void main (String[] args) throws java.lang.Exception 
 	{ 
  
   
         Scanner sc=new Scanner(System.in); 
          String string=sc.next(); 
boolean numeric = true; 
try { 
            Double num = Double.parseDouble(string); 
          } 
    catch (NumberFormatException e) 
    { 
             numeric = false; 
         } 
    
          if(numeric) 
              System.out.println( " yes"); 
         else 
             System.out.println( " No"); 
    
      } 
  } 












 




 



