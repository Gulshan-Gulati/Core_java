import java.util.*;
public class countsplit {
    private int splitCount(int[] arr, int l, int r){
        int sum = 0;
        for(int i = l; i<=r; i++){
            sum += arr[i];
        }
        if(sum % 2 != 0){
            return 0;
        }
        int leftSum = 0;
        for(int i = l; i<r; i++){
            leftSum += arr[i];
            if(leftSum*2 == sum){
                int left = splitCount(arr, l, i);
                int right = splitCount(arr, i+1, r);
                return 1+Math.max(left, right);
            }
        }
        return 0;
    }
    public static void main(String[] args) {

        int[] arr = {8,0,0,0,2,2,2,2};
        int n = arr.length;
        countsplit obj = new countsplit();
        int ans = obj.splitCount(arr, 0, n-1);
        System.out.println("Answer : " + ans);
    }
}
