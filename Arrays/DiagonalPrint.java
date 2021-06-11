import java.util.Scanner;

public class DiagonalPrint {
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
        //System.out.print(arr[0][0]);
        printDiagonal(arr,m,n);

    }

    private static void printDiagonal(int[][] arr, int m, int n) {
        int i=0,j=0;
        int total=m+m-1;
        for(int x=0;x<m+m-1;x++)
        {
            if(x<=(total/2))
            {
                i++;
                j=0;
                for(int k=i-1;k>=0;k--)
                {
                    System.out.print(arr[k][j]+" ");
                    j++;
                }
                j=1;
            }
            else{
               int l=i-1;

                for(int k=j;k<m;k++)
                {
                    System.out.print(arr[l][k]+ " ");
                    l--;
                }
                j++;
            }

        }
    }
}
