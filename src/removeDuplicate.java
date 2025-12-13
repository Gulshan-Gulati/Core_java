import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,6,4,5};
        int n = arr.length;
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0; i<n; i++){
            hash.add(arr[i]);
        }
        System.out.println(hash);
    }
}
