package ConditionalStatement;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of months");
        int month = sc.nextInt();

        switch (month){
            case 1 :
                System.out.println("January month");
                System.out.println("31 Days");
                break;
            case 2 :
                System.out.println("February month");
                System.out.println("28 Days");
                break;
            case 3 :
                System.out.println("March month");
                System.out.println("31 Days");
                break;
            case 4 :
                System.out.println("April month");
                System.out.println("30 Days");
                break;
            case 5 :
                System.out.println("May month");
                System.out.println("31 Days");
                break;
            case 6 :
                System.out.println("June month");
                System.out.println("30 Days");
                break;
            case 7 :
                System.out.println("July month");
                System.out.println("31 Days");
                break;
            case 8 :
                System.out.println("August month");
                System.out.println("31 Days");
                break;
            case 9 :
                System.out.println("September month");
                System.out.println("30 Days");
                break;
            case 10 :
                System.out.println("october month");
                System.out.println("31 Days");
                break;
            case 11 :
                System.out.println("November month");
                System.out.println("30 Days");
                break;
            case 12 :
                System.out.println("December month");
                System.out.println("31 Days");
                break;
            default:
                System.out.println("enter the correct number");
        }
    }
}
