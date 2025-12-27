import java.sql.Array;
import java.util.*;
public class rotateByk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int k = 2;
        k = k%n;
        List<Integer> ls = new ArrayList<>();
        for(int i = k; i<n; i++){
            ls.add(arr[i]);
        }
        for(int i = 0; i<2; i++){
            ls.add(arr[i]);
        }
        System.out.print(ls);
    }
}
