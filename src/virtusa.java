import java.util.ArrayList;

public class virtusa {
    public static void main(String[] args) {
        int[] num = {5,2,6,1};
        int n = num.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = i+1; j<n; j++){
                if(num[i] > num[j]){
                    count++;
                }
            }
            list.add(count);
        }
        System.out.println(list);
    }
}
