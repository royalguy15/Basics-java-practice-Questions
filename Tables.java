package Practicequestions;

import java.util.*;

public class Tables {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input N: ");
        double n = sc.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));
        }
    }
}
