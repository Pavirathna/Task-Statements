import java.util.Scanner;

public class PaintJob {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Widhth:");
        double width=sc.nextDouble();
        System.out.println("Enter Height");
        double height=sc.nextDouble();
        System.out.println("Enter areaPer Bucket:");
        double areaPerBucket=sc.nextDouble();
        System.out.println("Enter Extra Bucket :");
        double ExtraBucket=sc.nextDouble();
        System.out.println("Enter Area:");
        double area=sc.nextDouble();
        System.out.println(getBucketCount(width,height,areaPerBucket,ExtraBucket));
        System.out.println(getBucketCount(width,height,areaPerBucket));
        System.out.println(getBucketCount(area,areaPerBucket));
    }

    public static int getBucketCount(double width,double height,double areaPerBucket,double ExtraBucket)
    {
        if((width>0)&&(height>0)&&(areaPerBucket>0)&&(ExtraBucket>0))
        {
            double area=Area(width,height);
            double totalBucket=areaPerBucket*ExtraBucket;
            double neededBucket=area-totalBucket;
            double totalPaint=neededBucket/areaPerBucket;
            return  (int) Math.ceil(totalPaint);
        }
        return -1;
    }

    public static int getBucketCount(double width,double height,double areaPerBucket)
    {
        if((width>0)&&(height>0)&&(areaPerBucket>0))
        {
            double area=Area(width,height);
            double totalPaint=area/areaPerBucket;
            return  (int) Math.ceil(totalPaint);
        }
        return -1;
    }

    public static int getBucketCount(double area,double areaPerBucket)
    {
        if((area>0)&&(areaPerBucket>0))
        {
            double totalPaint=area/areaPerBucket;
            return  (int) Math.ceil(totalPaint);
        }
        return -1;
    }



    public static double Area(double width,double height)
    {
        double area=width*height;
        return area;
    }
}
