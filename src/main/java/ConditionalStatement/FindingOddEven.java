package ConditionalStatement;

import java.util.Scanner;

public class FindingOddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int x = sc.nextInt();

        if(x%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
}
