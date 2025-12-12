import java.sql.SQLOutput;
import java.util.Arrays;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted te
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        do {
            System.out.println("Guess my Number : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("Wooho....Congratulation you got that number");
                break;
            }else if(userNumber > myNumber){
                System.out.println("Your number is very large");
            }else{
                System.out.println("Your number is very small");
            }
        }while(userNumber >= 0);

        System.out.println("My number was: ");
        System.out.println(myNumber);
    }
}