package ConditionalStatement;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the value of x = ");
        int x = sc.nextInt();

        if(x>0){
            System.out.println(x + " is positive number");
        }
        else if(x<0){
            System.out.println(x + " is negative number");
        }
        else{
            System.out.println(x + " is Zero number");
        }
    }
}
