import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        String str = "abcd efgh";
        char[] arr = str.toCharArray();
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        System.out.print(arr);

//        System.out.println(arr);
    }
}
