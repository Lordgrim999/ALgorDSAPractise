import java.util.Scanner;

public class MajorityNumber{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt()-1;
            }

            findMajority(a,n);
        }
        private static void findMajority(int[] a, int n) {

            int major = a[0];
            int c = 1;
            for (int i = 1; i < n; i++) {
                if (major == a[i])
                    c++;
                else {
                    c--;


                }
                if (c == 0) {
                    //update majority element
                    major = a[i];
                    c = 1;
                }
            }
        }

}
