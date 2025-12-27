import java.util.Arrays;

public class mergeTwoSortArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,8};
        int[] brr = {2,4,6,9,10};
        int n = arr.length;
        int m = brr.length;
        int[] res = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n && j<m){
            if(arr[i] < brr[j]){
                res[k++] = arr[i++];
            }else{
                res[k++] = brr[j++];
            }
        }
        while(i<n){
            res[k++] = arr[i++];
        }
        while(j<m){
            res[k++] = brr[j++];
        }
        System.out.println(Arrays.toString(res));
    }
}
