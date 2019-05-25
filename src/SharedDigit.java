import java.util.Scanner;

public class SharedDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Number :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(hasSharedDigit(num1, num2));
    }
    public static boolean hasSharedDigit(int num1,int num2)
    {
        if((num1>=10&&num1<100)&&(num2>=10&&num2<100))
        {
                int r1,r2,r11,r21;
                r1=num1%10;//lastdigit of num1
                r2=num2%10;//lastdigit of num2
                r11=num1/10;//firstdigit of num1
                r21=num2/10;//firstdigit of num2
                 if((r1==r2)||(r11==r21)||(r1==r21)||(r2==r11))
                {
                    return true;
                }
                return false;
        }
        return false;
    }
}
