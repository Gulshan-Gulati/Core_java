public class palinStr {
    public static void main(String[] args) {
        String str = "Hello";
        int n = str.length();
        int low = 0;
        int high = n-1;
        while(low != high){
            if(str.charAt(low) != str.charAt(high)){
                System.out.println("Not Palindrome");
                return;
            }
            low++;
            high--;
        }
        System.out.println("yes this is a Palindrome String");
    }
}
