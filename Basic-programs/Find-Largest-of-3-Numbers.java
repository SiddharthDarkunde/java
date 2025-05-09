public class LargestOfThree {
    public static void main(String[] args) {
        int a = 12, b = 25, c = 9;
        if (a >= b && a >= c)
            System.out.println(a + " is the largest.");
        else if (b >= a && b >= c)
            System.out.println(b + " is the largest.");
        else
            System.out.println(c + " is the largest.");
    }
}
