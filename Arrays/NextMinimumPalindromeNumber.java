import java.util.*;
public class NextMinimumPalindromeNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        nextPalin(arr,n);


    }

    private static void nextPalin(int[] arr, int n) {
        if(checkAll9(arr))
        {System.out.print(1);
            for(int i=0;i<arr.length-1;i++)
            {
                System.out.print(0);
            }
            System.out.print(1);
        }
        else{
            utilityFind(arr,n);
            for(int i=0;i<n;i++)
                System.out.print(arr[i]);
        }
    }

    private static void utilityFind(int[] arr, int n) {
        int mid=n/2;
        int i=mid-1;
        //if even then mid else mid+1
        int j=n%2==0?mid:mid+1;
        boolean leftSmaller=false;

        //finding i,j pair which are not equal
        while(i>=0&&arr[i]==arr[j])
        {
            i--;
            j++;
        }
        //checking if left middle is less than right middle in both even or odd
        if(i<0||arr[i]<arr[j])
            leftSmaller=true;

        //overriding left elements to right elements
        while(i>=0)
        {
            arr[j++]=arr[i--];
        }
        if(leftSmaller)
        {
            int carry=1;
            //if odd checking if middle element is 9
            if(n%2==1)
            {
                arr[mid]+=carry;
                carry=arr[mid]/10;
                arr[mid]%=10;


            }
            i=mid-1;
            j=n%2==0?mid:mid+1;
            //if carry is greater than 0 then it must be added to left middle and override to right middle
            while(i>=0 && carry>0)
            {
                arr[i]+=carry;
                carry=arr[i]/10;
                arr[i]%=10;
                arr[j]=arr[i];
                i--;
                j++;

            }
        }
    }

    private static boolean checkAll9(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=9)
                return false;
        }
        return true;
    }

}
