import java.util.HashSet;

public class removeDup {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5,7};
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<n; i++){
            set.add(arr[i]);
        }
        System.out.println(set+" ");
    }
}
