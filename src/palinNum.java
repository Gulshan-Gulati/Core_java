public class palinNum {
    public static void main(String[] args) {
        int num = 12121;
        int temp = num;
        int rev = 0;
        while(temp != 0){
            int degit = temp % 10;
            rev = rev * 10 + degit;
            temp = temp/10;
        }
        if(num != rev){
            System.out.println("Not a palindrome Number");
        }else{
            System.out.println("Palindrome Number");
        }
    }
}
