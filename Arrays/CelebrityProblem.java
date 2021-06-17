import java.util.Scanner;

public class CelebrityProblem {
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
        int ans=findCelebrity(arr,0,n-1);
        if(ans!=-1){
            System.out.println(ans);}
        else {
            System.out.println("no celeb");
        }

    }

    private static int findCelebrity(int[][] arr, int m, int n) {


        while(m<n)
        {
            if(arr[m][n]==1)
            {
                m++;
            }
            else{
                n--;
            }


        }
        for(int i=0;i<arr.length;i++)
        {
            if(i!=m && arr[i][m]==0 || arr[m][i]==1)
                return -1;

        }
        return m;
    }
}
