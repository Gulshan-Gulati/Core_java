public class SecondLarg {
    public static void main(String[] args) {
        int[] arr = {3,1,2,10,2,7,9};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int secMax =Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
            }
            if(arr[i] > secMax && arr[i] < max){
                secMax = arr[i];
            }
        }
        System.out.println(secMax);

    }
}
