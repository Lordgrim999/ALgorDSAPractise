import java.util.*;
public class CountFrequencyArray {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt()-1;
        }

        findFrequency(a,n);
    }

    private static void findFrequency(int[] a, int n) {

       for(int i=0;i<n;i++)
       {

           a[a[i]%n]+=n;
       }
       for(int i=0;i<n;i++)
       {
           System.out.println(i+1+" "+a[i]/n);
       }
    }
}
