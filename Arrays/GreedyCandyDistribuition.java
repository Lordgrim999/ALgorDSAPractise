import java.util.Arrays;
import java.util.Scanner;

public class GreedyCandyDistribuition {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(totalCandy(arr,n));


    }

    private static int totalCandy(int[] arr, int n) {
        int lr[]=new int[n];
        int rr[]=new int[n];
        Arrays.fill(lr,1);
        Arrays.fill(rr,1);

        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
                lr[i]=lr[i-1]+1;

        }
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i+1]<arr[i])
                rr[i]=rr[i+1]+1;
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.max(lr[i],rr[i]);
        }
        return sum;

    }
}
