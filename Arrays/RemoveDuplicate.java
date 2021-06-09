import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args)
    {   ArrayList<Integer> arr=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            arr.add(sc.nextInt());
        }
        System.out.println(remove(arr,arr.size()));
    }

    private static int remove(ArrayList<Integer> arr, int size) {
        int i=0,j=1;
        while(j<size)
        {
            if(arr.get(i)!=arr.get(j))
            {
                int t=arr.get(i+1);
                arr.set(i+1,arr.get(j));
                arr.set(j,t);
                i++;
                j++;

            }
            else{
                j++;
            }

        }
        System.out.println(arr);
        return i+1;
    }
}
