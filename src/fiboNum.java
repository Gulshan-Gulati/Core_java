import java.util.*;
public class fiboNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        if(num == 1){
            System.out.print(1+" ");
        }else if(num == 2) {
            System.out.print(a + " " + b);
        }
        else if(num > 2) {
            System.out.print(a+" "+b+" ");
            for (int i = 3; i < num; i++) {
                int temp = a + b;
                System.out.print(temp + " ");
                a = b;
                b = temp;
            }
        }
    }
}
