package Arrays;
import java.util.* ;

public class MaxSubarraysum {
    public static void main (String[] args) {
        System.out.println("New Array of Light ");
        try(Scanner Sc = new Scanner (System.in)){
            
             System.out.println("Enter the Size of the Array  : ");
            int n = Sc.nextInt() ; 
            System.out.println("Enter the Arrya Numbers : ");
            int[] arr = new int[n] ; 
            
            for(int i = 0 ; i < n ; i++) {
                arr[i] = Sc.nextInt() ; 
            }
            int c = 0 ; 
              for(int i = 0 ; i < n ; i++) {
              System.out.print(arr[i] + "  "); 
               c += arr[i] ;
            }
             System.out.println("The total of the array is  " + c);
            
        }
    }
    public static void maxsubarraysum(int arr[] , int n) {
        //this is the brute force approach to find the maximum subarray sum
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++) {
            for(int j = i ; j < n ; j++) {
                int sum = 0;
                for(int k = i ; k <= j ; k++) {
                    sum += arr[k];
                }
                max_sum = Math.max(max_sum , sum);
            }
        }
        System.out.println("Maximum Subarray Sum is : " + max_sum);
    }
    public static void maxsubarraysum_kadane(int arr[] , int n ) {
        //this is the kadane's algorithm to find the maximum subarray sum
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for(int i = 0 ; i < n ; i++) {
            current_sum += arr[i];
            if(current_sum > max_sum) {
                max_sum = current_sum;
            }
            if(current_sum < 0) {
                current_sum = 0;
            }
        }
        System.out.println("Maximum Subarray Sum using Kadane's Algorithm is : " + max_sum);
    }
    public static void maxsubarraysum_prefixsum(int arr[] , int n) {
        //this is the prefix sum approach to find the maximum subarray sum
        int max_sum = Integer.MIN_VALUE;
        int[] prefix_sum = new int[n];
        prefix_sum[0] = arr[0];
        for(int i = 1 ; i < n ; i++) {
            prefix_sum[i] = prefix_sum[i-1] + arr[i];
        }
        for(int i = 0 ; i < n ; i++) {
            for(int j = i ; j < n ; j++) {
                int sum = prefix_sum[j] - (i > 0 ? prefix_sum[i-1] : 0);
                max_sum = Math.max(max_sum , sum);
            }
        }
        System.out.println("Maximum Subarray Sum using Prefix Sum is : " + max_sum);
    }
}
