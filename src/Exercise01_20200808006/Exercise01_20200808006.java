package Exercise01_20200808006;

import java.util.Scanner;

public class Exercise01_20200808006 {

    public static void main(String[] args) {

            /*
            1. Write a program that displays the following table on console:
            a a^2 a^3
            1 1 1
            2 4 8
            3 9 27
            4 16 64
            */
        System.out.println("a    a^2    a^3");
        for (int a = 1; a <5 ; a++) {
            System.out.println(a+"    "+(a*a)+"    "+(a*a*a));
        }



           /*
           2. Write a program that displays the result of:
                    (9.5 𝑥 4.5 − 2.5 𝑥 3) /  (45.5 − 3.5)
            */
        double nominator = (9.5*4.5)-(3*2.5);
        double denominator = (45.5 - 3.5);
        double result = nominator/denominator;
        System.out.println(result);



           /*
           3. π can be computed using the following formula:
                𝜋 = 4 𝑥 (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 ...)

                Write a program that displays the result of ;
                4 𝑥 (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)  and 4 𝑥 (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
            */
            double afterThe4TimesPart1 = 0;
            double n = 1;
        for (int i = 1; i <4 ; i++) {
            afterThe4TimesPart1 = afterThe4TimesPart1 + (2/(n*(n+2)));
                n = n+4;
        }
        double pi1 = 4*afterThe4TimesPart1;
        System.out.println(pi1);


        double afterThe4TimesPart2 = 0;
        double m = 1;
        for (int i = 1; i <5 ; i++) {
            afterThe4TimesPart2 = afterThe4TimesPart2 + (2/(m*(m+2)));
            m = m+4;
        }
        double pi2 = 4*afterThe4TimesPart2;
        System.out.println(pi2);




          /*
            4. Write a program that displays the area and perimeter of a circle that has a radius of 5.5
            using the π you have calculated in question 3
          */
        double radius = 5.5;
        double area = pi2*radius*radius;
        System.out.println(area);
        System.out.println(2*radius);



          /*
                          You can use Cramer’s rule to solve the following 2x2 system of linear equation:
                𝑎𝑥 + 𝑏𝑦 = 𝑒
                𝑐𝑥 + 𝑑𝑦 = 𝑓
                𝑥 =𝑒𝑑 − 𝑏𝑓  /  𝑎𝑑 − 𝑏𝑐
                𝑦 = 𝑎𝑓 − 𝑒𝑐 /  𝑎𝑑 − 𝑏𝑐

                Write a program that solves the following equation and display the value for x and y. Then
                calculate e and f by using the x and y.
                3.4𝑥 + 50.2𝑦 = 44.5
                2.1𝑥 + .55𝑦 = 5.9
           */
        double a = 3.4;
        double b = 50.2;
        double e = 44.5;

        double c = 2.1;
        double d = 0.55;
        double f = 5.9;

        double x=((e*d)-(b*f)) / ((a*d)-(b*c));
        double y=((a*f)-(e*c)) / ((a*d)-(b*c));

        System.out.println(x);
        System.out.println(y);



            /*
            6. Write a program that reads a Celsius degree in a double value from the console, then convert it
            to Fahrenheit and display the result. The formula for the conversion is as follows:
                 𝐹𝑎ℎ𝑟𝑒𝑛ℎ𝑒𝑖𝑡 = ( (9/5)*celcius ) +32
             */
        Scanner scanner = new Scanner(System.in);
        double celcius = scanner.nextDouble();
        double fahrenheit = ((1.8)*celcius)+32;
        System.out.println(fahrenheit);



            /*
                7. Write a program that reads in the radius and length of a cylinder and computes the area and
                    volume using the following formulas:
                        𝑎𝑟𝑒𝑎 = 𝑟𝑎𝑑𝑖𝑢𝑠 ∗ 𝑟𝑎𝑑𝑖𝑢𝑠 ∗ 𝜋
                        𝑣𝑜𝑙𝑢𝑚𝑒 = 𝑎𝑟𝑒𝑎 ∗ 𝑙𝑒𝑛𝑔𝑡ℎ
             */
        double radiusOfCylinder = scanner.nextDouble();
        double lengthOfCylinder = scanner.nextDouble();
        double areaOfCylinder = radiusOfCylinder*radiusOfCylinder*Math.PI;
        double volumeOfCylinder = areaOfCylinder*lengthOfCylinder;
        System.out.println(areaOfCylinder);
        System.out.println(volumeOfCylinder);



        /*
        8.Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
            For example, if an integer is 932, the sum of all its digits is 14. (Hint: use % operator to extract
        digits and use / operator to remove the extracted digit.)
         */
        int number = scanner.nextInt();
        int firstDigit = number%10;
        int secondDigit = (number/10)%10;
        int thirdDigit = (number/100)%10;
        int sumOfDigits = firstDigit+secondDigit+thirdDigit;
        System.out.println(sumOfDigits);



        /*
        9. Write a program that prompts the user to enter the minutes (e.g. 1 billion) and display the
            number of years and days for the minutes.
         */
        int minutes = scanner.nextInt();
        int years = minutes/(365*24*60);
        int days = (minutes%(365*24*60))/(24*60);
        System.out.println(years);
        System.out.println(days);




        /*
        10.Suppose you save $100 each month into a saving account with the annual interest rate 5%. Thus,
        the monthly interest rate is 0.05/12. After the first month the value in the account becomes
                    100 * (1 + 0.05/12) = 100,417
        After the second month, the value in the account becomes
                    (100 + 100.417) * (1 + 0.05/12) = 201,252
        And so on.

            Write a program that prompts the user to enter a monthly saving amount and displays the
        account value after the sixth month
         */
        double monthlySavingAmount = scanner.nextDouble();
        double accountValue = monthlySavingAmount;
        for (int i = 1; i <7 ; i++) {
            accountValue = (accountValue+monthlySavingAmount)*(1+0.05/12);
        }
        System.out.println(accountValue);



        /*
        11. Body Mass Index (BMI) is measure of health on weight. It can be calculated by taking your weight
        in kilograms and dividing by the square of your height int meters.
        Write a program that prompts the user to enter a weight in pounds and height in inches and
        displays the BMI. One pound is 0.45359237 kilograms, and one inch is 0.0254 meters
         */
        double weightInPounds = scanner.nextDouble();
        double heightInInches = scanner.nextDouble();
        double weightInKilograms = weightInPounds*0.45359237;
        double heightInMeters = heightInInches*0.0254;

        double bmi = weightInKilograms/(heightInMeters*heightInMeters);
        System.out.println(bmi);



        /*
            12. Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays
        their distance between them. (Hint: you can use Math.pow(a, 0.5) to compute √𝑎)
         */
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
        System.out.println(distance);



        /*
        13. Write a program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of a
            triangle and display its area. The formula for computing the area of a triangle is
         */
        double x_1 = scanner.nextDouble();
        double y_1 = scanner.nextDouble();
        double x_2 = scanner.nextDouble();
        double y_2 = scanner.nextDouble();
        double x_3 = scanner.nextDouble();
        double y_3 = scanner.nextDouble();

        double side1 = Math.pow(Math.pow(x_2-x_1,2)+Math.pow(y_2-y_1,2),0.5);
        double side2 = Math.pow(Math.pow(x_3-x_2,2)+Math.pow(y_3-y_2,2),0.5);
        double side3 = Math.pow(Math.pow(x_1-x_3,2)+Math.pow(y_1-y_3,2),0.5);
        double s = (side1+side2+side3)/2;
        double area_1 = Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5);
        System.out.println(area_1);

    }
}
