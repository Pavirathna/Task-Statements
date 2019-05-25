import java.util.Scanner;

public class AllFactors {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to find all factors of the number :");
        int number=sc.nextInt();
        printFactors(number);
    }
    public static void printFactors(int number) {
        int i=1;
        if(number>0) {
            while (i <= number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
                i++;
            }
        }
        else {
            System.out.println("Invalid value");
        }
    }
}
