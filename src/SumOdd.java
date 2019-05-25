import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        System.out.println(isOdd(num));
        System.out.println("Enter two number :");
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(SumOdd(start, end));

    }

    public static boolean isOdd(int num) {
        boolean check =false;
        if (num > 0) {
            if (num%2 != 0) {
                check = true;
            }
        }
        return check ;
    }

    public static int SumOdd(int start, int end) {
        int total = 0;
        if (start>0&&end>=start){
            for (int i = start; i <= end; i++) {
                if (isOdd(i))
                {
                    total += i;
                }
            }
        }
        else
            total = -1;
        return total;
    }
}

