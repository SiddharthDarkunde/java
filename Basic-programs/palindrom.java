import java.util.Scanner;
public class palindrom {
    
    public static void main(String args[]){
int rev=0,temp;
Scanner sc= new Scanner(System.in);
System.out.print("Enter a number to check it is palindrom or not : ");
int n=sc.nextInt();

temp=n;

while(n>0)
{
rev=(rev*10)+n%10;
n=n/10;
}
if(temp==rev)
System.out.println("number is palindrom");

else
System.out.println("number is not palindrom");

}
}
