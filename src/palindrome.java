import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        String str = "abcba";
        int start = 0;
        int end = str.length()-1;
        boolean isPalindrome = true;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome){
            System.out.println("Yes palindrome");
        }else{
            System.out.println("Not palindrome");
        }

    }
}
