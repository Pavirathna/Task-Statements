import java.util.Scanner;

public class LargestPrimeNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int number = sc.nextInt();
        System.out.println(getLargestPrimeNumber(number));
    }

    public static int getLargestPrimeNumber(int number)
    {
        for (int i = number - 1; i >= 1; i--) {
            if ((number % i == 0) && (isPrime(i))) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isPrime(int number)
    {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
