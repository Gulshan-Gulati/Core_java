public class secondHigest {
    public static void main(String[] args) {
        int[] arr = {2,2,32,5,67,42,2};
        int n = arr.length;
        int larg = Integer.MIN_VALUE;
        int secondLarg = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i] > larg){
                secondLarg = larg;
                larg = arr[i];
            }else if(arr[i] > secondLarg && arr[i] < larg){
                secondLarg = arr[i];
            }
        }

        System.out.println(secondLarg);
    }
}
