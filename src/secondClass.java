import java.util.*;
public class secondClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,1,4,10,21,42,34,54,24};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }
        }
        System.out.println("Second Maximum : "+ secMax);
    }
}
