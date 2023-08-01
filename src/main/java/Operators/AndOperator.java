package Operators;

public class AndOperator {
    public static void main(String[] args) {
        int age = 15;
        String Citizeship = "indian";
        if (age>=18 & Citizeship == "indian" ){
            System.out.println("he/she can vote");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}
