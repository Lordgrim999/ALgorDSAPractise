import java.util.Scanner;

public class FindMaxOneSortedMatrix {
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
        findRow(arr,m,n);

    }

    private static void findRow(int[][] arr, int m, int n) {
        int i=0,j=n-1;
        int ans=-1;
        while(i<m && j>=0)
        {
            if(arr[i][j]==1) {
                j--;
                ans=i;

            }
            else{


                i++;


            }
        }
        System.out.println(ans);
    }
}
