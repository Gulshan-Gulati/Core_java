import java.util.*;
public class checkPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input: ");
        String str = sc.next();
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Output: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
