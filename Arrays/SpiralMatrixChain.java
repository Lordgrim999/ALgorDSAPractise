import java.util.*;
public class SpiralMatrixChain {

    public static void main(String[] args)
    { int j=0;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for( j=0;j<n;j++)
            {
                System.out.println("enter ");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print(arr[0][0]);
        printSpiral(arr,m,n);

    }

    private static void printSpiral(int[][] arr, int m, int n) {
        //represent last row
        m--;
        //represent last column
        n--;
        //reprsent first column
        int k=0;
        //represent first row
        int l=0;
        //represent the row
        int i=0;
        //represent the column
        int j=0;
        while(l<m && k<n )
        {
            i=k;
            for(j=k;j<n;j++ )
            {
                System.out.print(arr[i][j]+" ");
            }
            j=n;
            for(i=l;i<m;i++) {
                System.out.print(arr[i][j] +" ");
            }

            i=m;
            for(j=n;j>k;j--) {
                System.out.print(arr[i][j] + " ");
            }
            j=k;
            for(i=m;i>k;i--) {
                System.out.print(arr[i][j] + " ");
            }

            l++;m--;n--;k++;
        }
    }
}
