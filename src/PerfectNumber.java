import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find all factors of the number :");
        int number=sc.nextInt();
        System.out.println(isPerfectNumber(number));
    }

    public static boolean isPerfectNumber(int number) {
        int preNumber=number;
        int sum=0;
        if(number>0)
        {
            for(int i=1;i<number;i++)
            {
                if(number%i==0)
                {
                    sum+=i;
                }
                //System.out.println(sum);
            }
            if(sum==preNumber)
            {
                return true;
            }
        }
        return false;
    }
}
