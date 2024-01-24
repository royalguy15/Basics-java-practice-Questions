package Practicequestions;

import java.util.*;

public class average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a: ");
        int a = sc.nextInt();
        System.out.print("Input b: ");
        int b = sc.nextInt();
        System.out.print("Input c: ");
        int c = sc.nextInt();

        int average = ((a + b + c) / 3);

        System.out.println("Average = " + average);
    }

}
