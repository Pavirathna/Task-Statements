import java.util.Scanner;

public class LastDigitChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers to check :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3=sc.nextInt();
        System.out.println(hasSameLastDigit(num1,num2,num3));
    }
    public static boolean hasSameLastDigit(int num1,int num2,int num3)
    {
        if(isValid(num1)&&isValid(num2)&&isValid(num3))
        {
            if((num1%10==num2%10)||(num2%10==num3%10)||(num3%10==num1%10))
            {
                return true;
            }
            return false;
        }
       return false;
    }

    public static boolean isValid(int num1)
    {
        if(num1>=10&&num1<=1000)
        {
            return true;
        }
        return false;
    }
}
