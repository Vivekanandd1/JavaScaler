package Operators;

import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int ch = sc.nextInt();
        String ans = ch%2==0?"Even":"odd";
        System.out.println(ans);
    }
}
