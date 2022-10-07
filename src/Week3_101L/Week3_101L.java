package Week3_101L;

import java.util.Scanner;

public class Week3_101L {
    public static void main(String[] args) {
        //1. Write a Java program to get a number from the user and print whether it is positive, negative or
        //zero
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please enter a number to test that is it negative or positive :");
        double number = scanner1.nextDouble();

        if (number>0){
            System.out.println("The number is positive");
        }else if (number==0){
            System.out.println("The number is neither positive nor negative. Which is zero :) ");
        }else{
            System.out.println("The number is negative");
        }



        /*
                2. The two roots of a quadratic equation 𝑎𝑥2 + 𝑏𝑥 + 𝑐 = 0 can be obtained using the following
        formula:
        𝑟1 =
        −𝑏 + √𝑏2 − 4𝑎𝑐
        2𝑎
        𝑟2 =
        −𝑏 − √𝑏2 − 4𝑎𝑐
        2𝑎
        𝑏2 − 4𝑎𝑐 is called the discriminant of the quadratic equation. If it is positive, the equation has
        two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real
        roots.
        Write a program that prompts the user to enter values for a, b and c and displays the result
        based on the discriminant. If the discriminant is positive, display two rotos. If the discriminant is
        0, display one root. Otherwise, display “The equation has no real roots”.
        Try with a, b, c: 1, 3, 1
        Try with a, b, c: 1 2 1
        Try with a, b, c: 1 2 3
         */

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter a number for a :");
        double a = scanner2.nextDouble();
        System.out.print("Please enter a number for b :");
        double b = scanner2.nextDouble();
        System.out.print("Please enter a number for c :");
        double c = scanner2.nextDouble();

        double discriminant = (b*b)-(4*a*c);
        if (discriminant>0){
            double root1 = (-b + Math.sqrt(discriminant))/(2*a);
            double root2 = (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("The equation has two roots "+root1+" and "+root2);
        }else if (discriminant==0){
            double root1 = (-b + Math.sqrt(discriminant))/(2*a);
            System.out.println("The equation has one root "+root1);
        }else{
            System.out.println("The equation has no real roots");
        }


    }
}
