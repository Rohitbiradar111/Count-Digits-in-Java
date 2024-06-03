//This program is about counting digits of a number in java

public class CountDigits {
    public static void main(String args[])
    {
        int n = 1234;
        int count = 0;
        while(n > 0)
        {
            n = n/10;
            count++;
        }
        System.out.print("Number of Digits in n are = "+count);
    }
}
