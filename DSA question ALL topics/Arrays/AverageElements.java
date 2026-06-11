package Arrays;

import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class AverageElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        double average = (double) sum/n;

        System.out.println(average);
    }
}
