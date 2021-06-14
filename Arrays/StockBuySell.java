import java.util.*;
public class StockBuySell {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        stockSell(arr,n);
    }

    private static void stockSell(int[] arr, int n) {
        int s=0;

        for(int i=1;i<n;i++)
        {
            if(arr[i]>arr[i-1])
                s+=arr[i]-arr[i-1];
        }
        System.out.println("Profit is "+s);
    }
}
