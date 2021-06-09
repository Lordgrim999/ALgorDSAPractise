import java.util.*;
public class Sort012 {
    public static void main(String[] args)
    {   ArrayList<Integer> arr=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt())
        {
            arr.add(sc.nextInt());
        }
        System.out.println(sortArrray(arr,arr.size()));
    }

    private static ArrayList<Integer> sortArrray(ArrayList<Integer> arr, int size) {
        int i=0,j=0;
        int k=size-1;
        while(j<=k)
        {

            if(arr.get(j)==2)
            {
                arr.set(j,arr.get(k));
                arr.set(k,2);
                k--;

                System.out.print("inside"+" "+k);
            }
            else if(arr.get(j)==0)
            {
                arr.set(j,arr.get(i));
                arr.set(i,0);
                i++;
                j++;
            }
            else{j++;}
            System.out.println(j+ " "+ k);
        }
        return arr;
    }
}
