import java.util.Scanner;

public class OccursTwoExcepctTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findTwoDistinctElement(arr,n);
    }

    private static void findTwoDistinctElement(int[] arr, int n) {
       int xor=arr[0];

       for(int i=1;i<n;i++)
       {
           xor^=arr[i];
       }
       xor=xor& ~(xor-1);
       int a=0,b=0;
       for(int i=0;i<n;i++)
       {
           if((arr[i]&xor)==0)
               a^=arr[i];
           b^=arr[i];
       }

       System.out.println(a+" "+b);
    }
}
