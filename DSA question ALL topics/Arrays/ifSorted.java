package Arrays;
import java.util.Scanner;


public class ifSorted {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean sorted = true;

            for (int i = 0; i < n - 1; i++) {

                if (arr[i] > arr[i + 1]) {

                    sorted = false;
                    break;
                }
            }

            if (sorted) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }}

