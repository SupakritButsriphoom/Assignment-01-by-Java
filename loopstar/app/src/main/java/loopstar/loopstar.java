/*
 * This source file was generated by the Gradle 'init' task
 */
package loopstar;

import java.util.Scanner;

public class loopstar {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 1; i <= a; i++) {

            for (int b = 1; b <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4 - 1; i >= 0; i--) {

            for (int d = 0; d <= i - 1; d++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}