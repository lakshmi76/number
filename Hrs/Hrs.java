 import java.util.*; 
 import java.lang.*; 
  import java,util.*; 
  class Hour 
 { 
 	public static void main (String[] args) throws java.lang.Exception 
	{ 
		        Scanner in = new Scanner(System.in); 
         System.out.print("hh:mm "); 
 		int min = in.nextInt();  
        int p1 = min % 60; 
        int p2 = min / 60; 
  
 
         int p3 = p2% 60; 
                p2 = p2 / 60; 
          
         System.out.print( p3 + ":" + p1); 
		System.out.print("\n"); 
  	} 
  } 
