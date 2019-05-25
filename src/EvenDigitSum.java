import java.util.Scanner;

public class EvenDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        System.out.println(getEvenDigitSum(num));
    }
    public static int getEvenDigitSum(int num)
    {
        int Sumtotal=0;
        int digit=0;
        if(num>0){
            while(num!=0)
            {
                digit=num%10;
                if(digit%2==0) {
                    Sumtotal += digit;
                }
                num/=10;
            }
            return Sumtotal;
        }
        return -1;
    }
}