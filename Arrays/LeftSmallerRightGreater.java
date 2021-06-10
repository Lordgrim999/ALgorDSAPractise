import java.util.Scanner;

public class LeftSmallerRightGreater {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(findNumber(arr,n));


    }

    private static int findNumber(int[] arr, int n) {

        int la[]=new int[n];
        int ra[]=new int[n];
        la[0]=Integer.MIN_VALUE;
        for(int i=1;i<n;i++)
        {
            la[i]=Math.max(la[i-1],arr[i-1]);
        }
        int right=Integer.MAX_VALUE;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>la[i] && arr[i]<right)
                return i;
            right=Math.min(right,arr[i]);
        }
        return -1;

    }
}
