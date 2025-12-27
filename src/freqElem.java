import java.util.HashMap;
import java.util.Map;

public class freqElem {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,6,2,2,2,7,3,7};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
