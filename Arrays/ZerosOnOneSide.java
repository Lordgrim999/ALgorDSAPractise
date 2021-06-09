import java.util.ArrayList;
import java.util.Scanner;

public class ZerosOnOneSide {
    public static void main(String[] args)
    {   ArrayList<Integer> arr=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            arr.add(sc.nextInt());
        }
        System.out.println(moveSide(arr,arr.size()));
    }

    private static ArrayList<Integer> moveSide(ArrayList<Integer> arr, int size) {
        int i=0,j=0;
        while(j<size)
        {
            if(arr.get(j)!=0 && arr.get(i)!=0)
            {
                i++;
                j++;
            }
            else if(arr.get(j)==0 && arr.get(i)==0){
                j++;

            }
            else{
                int t=arr.get(j);
                arr.set(j,arr.get(i));
                arr.set(i,t);
                i++;
                j++;
            }
        }
        return arr;
    }
}
