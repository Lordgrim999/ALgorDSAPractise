import java.util.*;
public class MaximumIncreasingDecreasing {
    public static void main(String[] args)
    {   ArrayList<Integer> arr=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            arr.add(sc.nextInt());
        }
        System.out.println(findMax(arr,0,arr.size()));
    }

    private static Integer findMax(ArrayList<Integer> arr, int start, int end)
    {
        if(start==end)
            return arr.get(start);
        if(end==start+1)
        return arr.get(start)>=arr.get(end)?arr.get(start):arr.get(end);
        int mid=(start+end)/2;
        if(arr.get(mid)>arr.get(mid-1) && arr.get(mid)>arr.get(mid+1) )
            return arr.get(mid);
        else if(arr.get(mid)>arr.get(mid-1) && arr.get(mid)<arr.get(mid+1))
            return findMax(arr,mid+1,end);
        else
            return findMax(arr,start,mid-1);
    }
}
