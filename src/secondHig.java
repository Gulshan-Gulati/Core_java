public class secondHig {
    public static void main(String[] args) {
        int[] arr = {1,2,42,2,65,4};
        int n = arr.length;
        int large = Integer.MIN_VALUE;
        int secLarg = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] > large){
                secLarg = large;
                large = arr[i];
            }
        }
        System.out.println(secLarg);

    }
}
