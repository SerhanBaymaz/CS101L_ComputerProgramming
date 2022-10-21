package Week5_101L;

import java.util.Scanner;

public class Week5_101L {
    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println();

        //1.QUESTİON
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 latitude in degrees: ");
        double x1 = input.nextDouble();
        System.out.print("Enter point 1 longitude in degrees: ");
        double y1 = input.nextDouble();
        System.out.print("Enter point 2 latitude in degrees: ");
        double x2 = input.nextDouble();
        System.out.print("Enter point 2 longitude in degrees: ");

        double y2 = input.nextDouble();
        double radius = 6371.01;

        double distance = radius * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
        System.out.println("The distance between the two points is " + distance + " km");
        System.out.println();


        //2.QUESTİON
        System.out.print("Enter a letter grade: ");
        Scanner scanner = new Scanner(System.in);

        String grade = scanner.nextLine();
        char letter = grade.charAt(0);

        if (letter == 'A' || letter == 'a') {
            System.out.println("The numeric value for grade " + letter + " is 4");
        } else if (letter == 'B' || letter == 'b') {
            System.out.println("The numeric value for grade " + letter + " is 3");
        } else if (letter == 'C' || letter == 'c') {
            System.out.println("The numeric value for grade " + letter + " is 2");
        } else if (letter == 'D' || letter == 'd') {
            System.out.println("The numeric value for grade " + letter + " is 1");
        } else if (letter == 'F' || letter == 'f') {
            System.out.println("The numeric value for grade " + letter + " is 0");
        } else {
            System.out.println(letter + " is an invalid grade");
        }


        //3.QUESTİON
        System.out.print("Enter two characters: ");
        Scanner scanner1 = new Scanner(System.in);
        String major = scanner1.nextLine();
        char major1 = major.charAt(0);
        char major2 = major.charAt(1);
        if (major1 == 'M' || major1 == 'm') {
            System.out.print("Mathematics ");
        } else if (major1 == 'C' || major1 == 'c') {
            System.out.print("Computer Science ");
        } else if (major1 == 'I' || major1 == 'i') {
            System.out.print("Information Technology ");
        } else {
            System.out.print("Invalid input");
        }

        if (major2 == '1') {
            System.out.print("Freshman");
        } else if (major2 == '2') {
            System.out.print("Sophomore");
        } else if (major2 == '3') {
            System.out.print("Junior");
        } else if (major2 == '4') {
            System.out.print("Senior");
        } else {
            System.out.print("Invalid input");
        }
        System.out.println();




        //4.QUESTİON

        //4.1
        System.out.print("Enter first name: ");
        Scanner scanner2 = new Scanner(System.in);
        String name1 = scanner2.nextLine();
        System.out.print("Enter second name: ");
        String name2 = scanner2.nextLine();

        if (name1.equals(name2)) {
            System.out.println("The names are the same");
        } else {
            System.out.println("The names are different");
        }

        //4.2
        System.out.println(name1 + " has " + name1.length() + " letters");
        System.out.println(name2 + " has " + name2.length() + " letters");

        //4.3
        System.out.println(name1.charAt(name1.length() - 1));
        System.out.println(name2.charAt(name2.length() - 1));



        //5.QUESTİON


        System.out.print("Enter string s1: ");
        Scanner scanner3 = new Scanner(System.in);
        String s1 = scanner3.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = scanner3.nextLine();
        if (s1.contains(s2)) {
            System.out.println(s2 + " is substring of " + s1);
        } else {
            System.out.println(s2 + " is not substring of " + s1);
        }

        //6.QUESTİON
        System.out.print("Enter an integer, the input ends if it is 0: ");
        Scanner scanner4 = new Scanner(System.in);
        int number = scanner4.nextInt();
        int positive = 0;
        int negative = 0;
        int total = 0;
        int count = 0;
        double average = 0;
        while (number != 0) {
            if (number > 0) {
                positive++;
            } else {
                negative++;
            }
            total += number;
            count++;
            number = scanner4.nextInt();
        }
        average = (double) total / count;
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average is " + average);

        //7.QUESTİON


        System.out.println();
        System.out.println("**************************************");
    }
}
