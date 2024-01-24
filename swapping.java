package Practicequestions;

import java.util.*;

public class swapping {
    public static void main(String args[]) {

        int x, y, z;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input Number x: ");
        x = sc.nextInt();

        System.out.print("Input Number y: ");
        y = sc.nextInt();

        z = x;
        x = y;
        y = z;

        System.out.print("swapped values are : " + x + "," + y);
    }

}
