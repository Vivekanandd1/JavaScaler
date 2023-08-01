package Operators;

public class OrOperator {
    public static void main(String[] args) {
        String Rlt = "Couple";
        int minage = 17;
        if (minage>=18 | Rlt=="Single"){
            System.out.println("make the entry");
        }
        else{
            System.out.println("stay out");
        }
    }
}
