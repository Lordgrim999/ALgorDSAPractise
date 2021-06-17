import java.util.*;
public class FindAllSubarrayWithZero {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        findSubarray(arr,n);
    }

    private static void findSubarray(int[] arr, int n) {
        HashMap<Integer,ArrayList<Integer>> map =  new HashMap<>();

        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            ArrayList<Integer> list=new ArrayList<>();
            if(map.containsKey(sum))
            {
                list = map.get(sum);
                for (int j=0;j<list.size();j++)
                {
                    System.out.println(list.get(j)+1+ " "+i);

                }
            }
            list.add(i);
            map.put(sum,list);

        }
    }
}
