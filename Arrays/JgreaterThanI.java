import java.util.Scanner;

public class JgreaterThanI{
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
            int left[]=new int[n];
            int right[] = new int[n];
            left[0]=arr[0];
            for(int i=1;i<n;i++)
            {
               left[i]=left[i-1]>arr[i]?i:left[i-1];

        }
            right[n-1]=n-1;
            for(int i=n-2;i>=0;i++)
            {
                right[i]=right[i+1]>arr[i]?right[i+1]:i;
            }
            int i=0,j=0,mk=0;
            while(i<n&&j<n)
            {
                if(right[j]>left[i])
                {
                    mk=Math.max(mk,j-i);
                    j++;
                }
                else{
                    i++;
                }
            }
            return mk;
}
}
