// day 2 reverce string without fuction  program 
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S1;
        char R;
        System.out.print("Enter a string :");
        S1=s.nextLine();
        
        for(int i= S1.length()-1;i>=0;i--)
        {
            R=S1.charAt(i);
             System.out.print(R);
        }
    }
}
