package ConditionalStatement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weather around you");
        String weather = sc.next();

        switch (weather) {
            case "rainy" :
                System.out.println("take umbrella");
                break;
            case "sunny" :
                System.out.println("take cap along with you");
                break;
            default:
                System.out.println("check weather forcast");
        }
    }
}
