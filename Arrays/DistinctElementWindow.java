import java.util.*;

public class DistinctElementWindow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        findDistinct(arr,n,k);
    }

    private static void findDistinct(int[] arr, int n,int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<k;i++)
        {
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
            {
                map.put(arr[i],1);
            }
        }
        System.out.println("Distinct"+" "+map.size());
        System.out.println(map);
        int i=0;
        while(k<n)
        {
            if(map.get(arr[i])==1)
                map.remove(arr[i]);
            else{
                map.put(arr[i],map.get(arr[i])-1);

            }
            i++;
            if(map.containsKey(arr[k]))
                map.put(arr[k],map.get(arr[k])+1);
            else{
                map.put(arr[k],1);
            }
            k++;
            System.out.println("Distinct"+" "+map.size());
            System.out.println(map);


        }
    }
}
