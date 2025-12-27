import java.util.ArrayList;
import java.util.List;

public class moveAllZero {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,0,0,0,2,3,1,3,324,4,6};
        int n = arr.length;
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(arr[i] != 0){
                ls1.add(arr[i]);
            }else{
                ls2.add(arr[i]);
            }
        }
        for(int x : ls1){
            result.add(x);
        }
        for(int y : ls2){
            result.add(y);
        }
        System.out.println(result);
    }
}
