import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
              inputThenPrintSumAverage();
    }
    public static void  inputThenPrintSumAverage()
    {
        Scanner sc=new Scanner(System.in);
        int XX=0,count=0;
        long YY=0;
        System.out.println("Enter the values");
        while(sc.hasNextInt())
        {

            int value=sc.nextInt();
            XX+=value;
            count++;
        }
        if(count>0)
        {
            YY=XX/count;
            System.out.println("SUM = "+XX+" "+"AVG = "+Math.round(YY));
        }
        else
            System.out.println("SUM = "+XX+" "+"AVG "+YY);

    }
}
