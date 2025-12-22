import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        if(n >= 2){
            System.out.print(a+" "+b+" ");
        }
        for(int i = 3; i<=n; i++){
            int temp = a+b;
            System.out.print(temp+" ");
            a = b;
            b = temp;
        }
    }
}
