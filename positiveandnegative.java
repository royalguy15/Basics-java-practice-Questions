package Practicequestions;

import java.util.*;

public class positiveandnegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a Number: ");
        double number = sc.nextInt();

        if (number > 0) {
            System.out.println("positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Number is zero");
        }
    }

}
