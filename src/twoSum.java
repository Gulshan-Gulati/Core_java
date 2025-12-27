import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,76,4,7};
        int target = 9;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                System.out.println(map.get(rem)+","+i);
            }
            map.put(arr[i], i);
        }
    }
}
