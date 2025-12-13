import java.util.*;
public class findDuplicateusingmap {
    public static void main(String[] args) {
        int[] arr = {1,3,8,4,7,6,8};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        //print duplicate element
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }

        //non duplicate element
        for(int c : map.keySet()){
            if(map.get(c) == 1){
                System.out.print(c+" ");
            }
        }
    }
}
