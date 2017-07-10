import java.io.*;
import java.util.*;
public class Prime{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n,i=0,temp=0;
    System.out.println("Enter the numder is:");
    n=s.nextInt();
    for(i=2;i<=n/2;i++){
      if(n%i==0){
        temp=1;
        break;
      }
    }
    if(temp==0)
       System.out.println(n+"  is prime");
    else
       System.out.println(n+" is not prime");
      }
}  
        
      
    
  
