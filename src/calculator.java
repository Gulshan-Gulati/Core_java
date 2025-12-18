import java.util.*;
public class calculator {
    public static void main(String[] args) {
        //1 2 3 4 5 6 7 8 9 0
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        if(a == 0 && b == 0){
            System.out.println("0");
            return;
        }
        if(a>0 && b==0){
            System.out.println("Not Define");
            return;
        }
        System.out.println("Enter char : ");
        char ch = sc.next().charAt(0);
        if(ch == '+'){
            System.out.println(a+b);
        } else if(ch == '-'){
            System.out.println(a-b);
        } else if(ch == '*'){
            System.out.println(a*b);
        } else if(ch == '/'){
            System.out.println(a/b);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
