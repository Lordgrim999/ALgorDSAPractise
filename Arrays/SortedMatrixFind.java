import java.util.Scanner;

public class SortedMatrixFind {
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
        int val=sc.nextInt();
        //System.out.print(arr[0][0]);
        findNum(arr,m,n,val);

    }

    private static void findNum(int[][] arr, int m, int n, int val) {
        int i=0,j=n-1;
        while(i<m && j>=0)
        {
            if(val==arr[i][j])
            {
                System.out.println("found");
                break;
            }
            if(val>arr[i][j])
            {
                j--;
            }
            else {
                i++;
            }
        }

    }
}
