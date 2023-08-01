package ConditionalStatement;

import java.util.Scanner;

public class VowelsConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any character between A to Z");
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'a':
            case 'i':
            case 'e':
            case 'o':
            case 'u':
                System.out.println("Vowels");
                break;
            default:
                System.out.println("consonant");


        }

    }
}
