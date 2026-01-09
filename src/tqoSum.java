import java.util.*;
public class tqoSum {
    public static void main(String[] args) {
        int target = 8;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of element: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter value: ");
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                System.out.println(map.get(rem)+" "+i);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("Not found");
        sc.close();
    }
}
