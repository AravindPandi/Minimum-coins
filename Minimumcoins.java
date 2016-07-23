/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Aravind
 */
public class Minimumcoins {

    public static void main(String[] args) {
        // TODO code application logic here
        int k = 0;
        int d = 0;
        System.out.println("Enter the variety of coins value:");
        Scanner s1 = new Scanner(System.in);
        String c = s1.nextLine();
        System.out.println("Enter the sum:");
        Scanner s2 = new Scanner(System.in);
        int b = s2.nextInt();
        String[] a = c.split(" ");
        for (int i = a.length - 1; i >= 0; i--) {
            int n;
            n = Integer.parseInt(a[i]);
            if (b == 0) {
                break;
}
            k = b / n;

            d = d + k;
            b = b % n;
}
        System.out.println(d);
    }
}

