import java.util.*;
public class OccursTwoXor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findDistinctElement(arr,n);
    }

    private static void findDistinctElement(int[] arr, int n) {
        int ele=arr[0];
        for(int i=1;i<n;i++)
        {
            ele=ele ^ arr[i];
        }
        System.out.print(ele);

    }

}
