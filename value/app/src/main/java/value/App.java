/*
 * This source file was generated by the Gradle 'init' task
 */
package value;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input value A");
        int a = scanner.nextInt();
        System.out.println("Input value B");
        int b = scanner.nextInt();
        System.out.println("Input value C");
        int c = scanner.nextInt();
        scanner.close();
        if (a >= b && a >= b)
            System.out.println("Max value is A");
        else if (b >= a && b >= c)
            System.out.println("Max value is B");

        else
            System.out.println("Max value is C");
    }
}