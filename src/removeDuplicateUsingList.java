import java.util.ArrayList;

public class removeDuplicateUsingList {
    public static void main(String[] args) {
        int[] arr = {1,3,1,2,4,5,4};
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
