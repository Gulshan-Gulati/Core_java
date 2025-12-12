import java.util.*;
public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(1);
        System.out.print(a+" "+b+" ");
        for(int i = 2; i<n; i++){
            int temp = a+b;
            System.out.print(temp+" ");
            a = b;
            b = temp;
        }
    }
}
