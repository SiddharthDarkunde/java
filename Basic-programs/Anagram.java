
import java.util.Arrays;
import java.util.Scanner;

class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string ");
        String s1 = sc.nextLine();
        System.out.print("Enter Second string ");
        String s2 = sc.nextLine();

        

        if (s1.length() == s2.length()) {
            char[] a1 = s1.toCharArray();
            char[] a2 = s2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);

            boolean result =Arrays.equals(a1, a2);

            if(result==true)
            {
                System.out.println("String is anagram");
            }

            else
            {
                System.out.println("String is not anagram");
            }


        }

        else
        System.out.println("string is not anagram");

    }

}
