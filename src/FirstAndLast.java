import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        System.out.println(sumFirstLastDigit(num));
    }
    public static int sumFirstLastDigit(int num)
    {
        int lastDigit,r,firstDigit,Sumtotal;
        int reverse=0;
        if(num>=0) {
            lastDigit = num % 10;
            while (num > 0) {
                r = num % 10;
                reverse = (reverse * 10) + r;
                num /= 10;
            }
            firstDigit = reverse % 10;
            Sumtotal = firstDigit + lastDigit;
            return Sumtotal;
        }
        return -1;
    }
}