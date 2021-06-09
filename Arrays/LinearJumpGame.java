import java.util.ArrayList;
import java.util.Scanner;

public class LinearJumpGame {
    public static void main(String[] args)
    {   ArrayList<Integer> arr=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            arr.add(sc.nextInt());
        }
        System.out.println(jumpGame(arr,arr.size()));
    }

    private static int jumpGame(ArrayList<Integer> arr, int size) {
        int a=arr.get(0);
        int b=arr.get(0);
        int jump=1;
        for( int i=1;i<size;i++)
        {
            if(i==size-1)
                return jump;
            a--;
            b--;
            if(arr.get(i)>b)
                b=arr.get(i);
            if(a==0)
            {
                jump++;
                a=b;
            }
        }
        return jump;
    }
}
