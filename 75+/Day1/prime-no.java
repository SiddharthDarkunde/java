// day 1 prime number program 
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=0; 
        boolean flag=true;
        System.out.print("Enter a number : ");
        n=s.nextInt();
      
    if(n==1)
    System.out.println("1 is not prime number ");
    
    
     for(int i=2; i< n/2;i++)
     {
         if(n%i==0)
         {
            flag=false;
             break;
         }
        
     }
     
      if(flag)
         System.out.println("it is prime ");
        
     else
     System.out.println("not prime ");
        
    
    }
}
