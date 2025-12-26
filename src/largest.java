public class largest {
    public static void main(String[] args) {
        int[] arr = {1,3,2,5,1,10,7};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
