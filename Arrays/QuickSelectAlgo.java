import java.awt.*;
import java.util.*;
public class QuickSelectAlgo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.print(findKthSmallest(arr,0,n-1,k));
    }

    private static int findKthSmallest(int[] arr, int l, int h , int k) {
        if(k>0 && k<=h-l+1)
        {
            int index = findPivot(arr,l,h);
            System.out.println("index "+" "+index);
            if(index-l==k-1)
                return arr[index];
            if(index-l>k-1)
                return findKthSmallest(arr,l,index-1,k);
            return findKthSmallest(arr,index+1,h,k-index+l-1);
        }
        return Integer.MAX_VALUE;

    }

    private static int findPivot(int[] arr, int l, int h) {
     int n=h-l+1;
      int pivot = (int)(Math.random())*(n-1);
      swap(arr,l+pivot,h);
        return divideArr(arr,l,h);
    }

    private static int divideArr(int[] arr, int l, int h) {
        int x=arr[h];
        int i=l;
        for(int j=l;j<=h-1;j++)
        {
            if(arr[j]<=x)
            {
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,h);
        return i;
    }

    private static void swap(int[] arr, int i, int h) {
        int t=arr[i];
        arr[i]=arr[h];
        arr[h]=t;
    }
}
