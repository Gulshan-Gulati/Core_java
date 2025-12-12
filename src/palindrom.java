import java.util.*;
public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
        while(temp != 0){
            int digit = temp%10;
            rev = rev*10 + digit;
            temp = temp/10;
        }
        if(rev == num){
            System.out.println("Yes this is Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
