package Arrays;


import java.util.Scanner;
import java.util.Arrays;

public class targetSum {

    public class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int k = sc.nextInt();

            Arrays.sort(arr);

            int left = 0;
            int right = n - 1;

            boolean found = false;

            while(left < right) {

                int sum = arr[left] + arr[right];

                if(sum == k) {

                    System.out.println(arr[left] + " " + arr[right]);

                    found = true;
                    break;
                }

                else if(sum < k) {

                    left++;
                }

                else {

                    right--;
                }
            }

            if(!found) {
                System.out.println("No Pair Found");
            }
        }
    }
}
