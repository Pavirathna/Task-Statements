import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers :");
        int first = sc.nextInt();
        int second=sc.nextInt();
        System.out.println(getCommonDivisor(first,second));
    }

    public static int getCommonDivisor(int first, int second) {
        if(first>=10&&second>=10) {
            int count = 0;
            for (int i = 2; i <= greatestNum(first,second); i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    count = i;
                }
            }
            return count;//return greatest common divisor
        }
        return -1;
    }

    public static int greatestNum(int num1,int num2){
    if(num1>num2)
    {
        return num2;
    }
    return num2;
    }
}
