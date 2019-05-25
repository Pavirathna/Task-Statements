import java.util.Scanner;

public class FlourPackProblem {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bigcount,small count,goal :");
        int BigCount = sc.nextInt();
        int SmallCount = sc.nextInt();
        int Goal = sc.nextInt();
        System.out.println(canPack(BigCount,SmallCount,Goal));
    }

    public static boolean canPack(int BigCount,int SmallCount,int Goal)
    {
        int sum =BigCount*5;
        if((BigCount>=0)&&(SmallCount>=0)&& (Goal>=0)&&(sum<=Goal)){
         if(sum+SmallCount>=Goal)
         {
            return true;
         }
     }
     return false;
    }
}
