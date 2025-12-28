public class vowelConsonant {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] arr = str.toCharArray();
        int n = arr.length;
        int countVowel = 0;
        int countConsonent = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'u'){
                countVowel++;
            }else if(arr[i] == ' '){
                continue;
            }
            else{
                countConsonent++;
            }
        }
        System.out.println("Vowel Count: "+countVowel);
        System.out.println("Consonent Count: "+countConsonent);
    }
}
