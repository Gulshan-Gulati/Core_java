public class dispIngredient {
    public static void main(String[] args) {
        String ing = "123123";
        int count = 0;
        for(int i = 0; i<ing.length(); i++){
            int count1=0, count2 = 0, count3 = 0;
            for(int j = i; j<ing.length(); j++){
                if(ing.charAt(j) == '1'){
                    count1++;
                }else if(ing.charAt(j) == '2'){
                    count2++;
                }else if(ing.charAt(j) == '3'){
                    count3++;
                }else{
                    break;
                }
                if(count1 == count2 && count2 == count3 && count1>0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
