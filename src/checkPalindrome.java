public class checkPalindrome {
    public static void main(String[] args) {
        int num = 1221;
        int temp = num;
        int reverse = 0;
        while(temp != 0){
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp/10;
        }
        if(reverse == num){
            System.out.println("Yes palindrome number");
        }else{
            System.out.println("Not a palindrome number");
        }
    }
}
