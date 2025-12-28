public class findDuplicateChar {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e','f','g','h','b'};
        int n = arr.length;
        char charDuplicate = 0;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    charDuplicate = arr[i];
                    break;
                }
            }
        }
        System.out.println(charDuplicate);
    }
}
