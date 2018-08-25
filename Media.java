 import java.util.*; 
  import java.lang.*; 
 import java.io.*; 
 import java.util.Scanner;
 
  class Med 
 { 
 	public static void main (String[] args) throws java.lang.Exception 
	{ 
  	  int n; 
       Scanner sc= new Scanner(System.in); 
        n=sc.nextInt(); 
      int scores[] = new int[n] ; 
           for(int i = 0; i < n; i++) 
         { 
              scores[i] = sc.nextInt(); 
  } 
       Arrays.sort(scores); 
       System.out.print("Sorted Scores: "); 
       for (int x : scores) { 
         System.out.print(x + " "); 
       } 
System.out.println(""); 
   
       // Calculate median (middle number) 
       double median = 0; 
       double pos1 = Math.floor((scores.length - 1.0) / 2.0); 
        double pos2 = Math.ceil((scores.length - 1.0) / 2.0); 
    if (pos1 == pos2 ) { 
           median = scores[(int)pos1]; 
       } else { 
          median = (scores[(int)pos1] + scores[(int)pos2]) / 2.0 ; 
      } 
System.out.println(  median); 
    
     } 
  }   
 
