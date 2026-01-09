import java.util.*;
public class findDup {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,5,7,6};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)>1){
                System.out.println(key);
            }
        }
    }
}
