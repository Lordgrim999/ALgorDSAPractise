import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(findWater(arr,n));


    }

    private static int findWater(int[] arr, int n) {
        int left[]=new int[n];
        int right[] = new int[n];
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
            left[i]=max;

        }
        int sum=0;
        max=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            max=Math.max(arr[i],max);
            sum+=Math.min(left[i],max)-arr[i];
        }
        return sum;
    }
}
