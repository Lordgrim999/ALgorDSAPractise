import java.util.*;

public class MinimumPlatforms {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int dep[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            dep[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(dep);
        System.out.println(findPlatform(arr,dep,n));


    }

    private static int findPlatform(int[] arr, int[] dep, int n) {
        int i=0,j=0;
        int plat=0,maxplat=0;
        while(i<n&&j<n)
        {
            if(arr[i]<dep[j])
            {
                i++;
                plat++;

                if(plat>maxplat)
                {
                    maxplat=plat;
                }
            }
            else if(arr[i]>dep[j])
            {
                j++;
                plat--;
            }
        }
        return maxplat;
    }
}
