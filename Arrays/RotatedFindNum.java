import java.util.*;
public class RotatedFindNum {
    public static void main(String[] args)
    {
        List<Integer> arr=new ArrayList<Integer>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to found");
        int n =sc.nextInt();
        System.out.println("Enter the array");
        while(sc.hasNextInt())
        {
            arr.add(sc.nextInt());
        }


        System.out.println(FindNum(arr,0,arr.size(),n));

    }

    private static Integer FindNum(List<Integer> arr, int start, int end, int n) {
        if(start>end)
            return -1;
        int mid=(start+end)/2;
        if(arr.get(mid)==n)
            return mid;
        if(arr.get(mid)>=arr.get(start))
        {
            if(n>=arr.get(start) && arr.get(mid)>=n)
                return FindNum(arr,start,mid-1,n);
            return FindNum(arr,mid+1,end,n);
        }
        if(arr.get(mid)<=n &&n<=arr.get(end))
            return FindNum(arr,mid+1,end,n);
        return FindNum(arr,start,mid-1,n);

    }


}
