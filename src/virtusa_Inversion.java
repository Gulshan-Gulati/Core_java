import java.sql.SQLOutput;
import java.util.*;
public class virtusa_Inversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int start = 1;
        int end = n;
        for(int i = 0; i<n; i++){
            if(k >= (end - start)){
                list.add(end);
                k -= (end - start);
                end--;
            } else{
                list.add(start);
                start++;
            }
        }
        if(k != 0){
            System.out.println(-1);
            return;
        }
        System.out.println(list);
    }
}
