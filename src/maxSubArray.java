import java.util.*;
public class maxSubArray {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] arr = {-1,-2,4,-2,-1,4,5,-2,1};
        int n = arr.length;
        int currMax = 0;
        int maxSum = 0;
        for(int i = 0 ; i<n; i++){
            currMax = Math.max(arr[i], arr[i]+currMax);
            maxSum = Math.max(maxSum, currMax);
        }
        System.out.println(maxSum);
    }
}
