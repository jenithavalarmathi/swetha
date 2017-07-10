import java.io.*;
import java.util.*;
import java.lang.*;
public class Operators{
  public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  int a,b,i,c=0;
  System.out.println("Enter the 2 values:");
  a=s.nextInt();
  b=s.nextInt();
  i=s.nextInt();
  switch(i)
  {
      case 1:
        c=a+b;
        
      case 2:
        c=a-b; 
        
      case 3:
        c=a*b;
        
      case 4:
        c=b/a;
       
      case 5:
        c=b%a;
       
      case 6:
        c=b++;
        
      case 7:
      c=b--;
        
      case 8:
      c=a&b;
       
        case 9:
        c=a|b;
        
         case 10:
         c=a^b;
       
         case 11:
         c=a<<2;
        
         case 12:
         c=a>>2;
        
         case 13:
         c=a>>>2;
        case 14:
        c=a&&b;
      
        case 15:
        if( a||b)
        //c=(a||b);
       
        case 16:
        if(!c)
        
      }
                System.out.println(c); 
  }
}





    
  
