import java.util.Scanner;

public class NumbersOfDaysInMonth {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Month and  Year");
        int month = s.nextInt();
        int year = s.nextInt();

        //  System.out.println(isLeapYear(year));
        System.out.println(getDaysinMonth(month,year));
    }

    public static boolean isLeapYear(int year) {
        boolean check=false;
        if ((year % 4 == 0) &&( year>0&&year<9999)){
            if ((year % 100 == 0)) {
                if (year % 400 != 0) {
                    //return check;
                    return false;
                }
            }
            check=true;             //return  true;
        }
        return check;   // return false;
    }

    public static int  getDaysinMonth(int month,int Year)
    {
        switch (month)
        {
            case 2:
                if (isLeapYear(Year))
                {
                    return 29;
                }
                return 28;

            case 1:  case 3:  case 5:  case 7:  case 8:  case 10:  case 12:
                return 31;

            case 4:  case 6:  case 9:  case 11:
                return 30;

            default:
                return -1;
        }

    }
}




