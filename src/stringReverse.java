import java.util.*;
public class stringReverse {
    public static void main(String[] args){
        String str = "abcd";
        int n = str.length();
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(arr);
    }
}
