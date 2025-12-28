public class palindromeString {
    public static void main(String[] args) {
        String str = "abcdedcba";
        int n = str.length();
        int low = 0;
        int high = n-1;
        boolean isPalin = true;
        while(low<high){
            if(str.charAt(low) != str.charAt(high)){
                isPalin = false;
            }
            low++;
            high--;
        }
        if(!isPalin){
            System.out.println("Not palindrome string");
        }else{
            System.out.println("Palindrome String");
        }

    }
}
