package quiz1_20200808006;

import java.util.Scanner;
/*
        Ibrahim Baymaz - 20200808006
        14/10/2022 15:15
        YLab1 - Antalya
 */
public class Quiz1_20200808006 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        //10.Bonus question.
        System.out.print("Enter a question number(between 4-9) : ");
        int questionNumber = scanner.nextInt();

        switch (questionNumber) {
            case 4:
                //4.Area and perimeter of a rectangle.
                double width = 4.5;
                double height = 7.9;
                double area = width * height;
                double perimeter = 2 * (width + height);
                System.out.println("Area: " + area);
                System.out.println("Perimeter: " + perimeter);
                break;
            case 5:
                //5.area of a hexagon
                System.out.print("Enter the side of a hexagon: ");
                double s = scanner.nextDouble();
                double areaHexagon = (3 * Math.sqrt(3) / 2) * Math.pow(s, 2);
                System.out.println("Area of hexagon: " + areaHexagon);
                break;
            case 6:
                //6.cost of driving in LIRA
                final double LIRA = 18.59;
                System.out.print("Enter the driving distance: ");
                double distance = scanner.nextDouble();
                System.out.print("Enter miles per gallon: ");
                double milesPerGallon = scanner.nextDouble();
                System.out.print("Enter price per gallon: ");
                double pricePerGallon = scanner.nextDouble();

                double cost = (distance / milesPerGallon) * pricePerGallon;
                System.out.println("The cost of driving is: " + cost);
                int costInLira = (int) (cost * LIRA);
                System.out.println("The cost of driving in lira is: " + costInLira);

                break;
            case 7:
                //7.Jake and Mike's dice roll program.
                int jake = (int) (Math.random() * 6) + 1;
                int mike = (int) (Math.random() * 6) + 1;
                boolean isEqual = (jake == mike);
                System.out.println("Is equal: " + isEqual);
                System.out.println("Jake: " + jake);
                System.out.println("Mike: " + mike);

                break;
            case 8:
                //8.number between -5 and 5 for understand the if-else statement.
                System.out.print("Enter a number between -5 and 5: ");
                int numberr = scanner.nextInt();
                if (numberr < -5 || numberr > 5) {
                    System.out.println("Not in range");
                } else if (numberr % 2 != 0 || numberr < 0) {
                    System.out.println("Square of number: " + Math.pow(numberr, 2));
                } else {
                    System.out.println("Square root of number: " + Math.sqrt(numberr));
                }

                break;
            case 9:
                //9.positives and negatives in while loop.
                double positives = 0;
                double negatives = 0;

                while (true) {
                    System.out.print("Enter a number: ");
                    double number = scanner.nextDouble();
                    if (number > 0) {
                        positives += number;
                        if (number % 2 == 0) {
                            positives /= 2;
                        } else {
                            positives *= 3;
                            positives++;
                        }
                    } else if (number < 0) {
                        negatives += number;
                        if (number % 2 == 0) {
                            negatives *= 2;
                        } else {
                            negatives /= 3;
                            negatives--;
                        }
                    } else {
                        System.out.println("Result: " + positives / negatives);
                        break;
                    }
                }

                break;
            default:
                System.out.println("Error");
        }


    }
}
