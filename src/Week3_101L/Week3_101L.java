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
         is called the discriminant of the quadratic equation. If it is positive, the equation has
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



        /*
                3. At a playground, all children aged 10 or over are allowed to ride bicycle. For children under 10,
        they can only ride the bicycle if their height is over 120cm. Write a program that asks the user for
        their age and prints if they are allowed on the ride or not.
        Note: You should only ask the user for their height if this is required for your code to make a
        decision
         */

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Please enter your age :");
        int age = scanner3.nextInt();
        if (age>=10){
            System.out.println("You are allowed to ride the bicycle");
        }else{
            System.out.print("Please enter your height :");
            int height = scanner3.nextInt();
            if (height>120){
                System.out.println("You are allowed to ride the bicycle");
            }else{
                System.out.println("You are not allowed to ride the bicycle");
            }
        }



        /*
        4. Write a program that plays rock-paper-scissors with the user. Generate a random integer that
can be 1, 2 or 3. Rock is represented with 1, paper is represented with 2 and scissors is
represented with 3. Ask the user to enter their choice and display the results to user. If user
enters anything other than 1, 2 or 3, print an error message
         */

        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Please enter your choice (1 for rock, 2 for paper, 3 for scissors) :");
        int choice = scanner4.nextInt();
        int computerChoice = (int)(Math.random()*3)+1;

        if (choice==1){
            if (computerChoice==1){
                System.out.println("You chose rock and computer chose rock. It is a draw");
            }else if (computerChoice==2){
                System.out.println("You chose rock and computer chose paper. Computer wins");
            }else{
                System.out.println("You chose rock and computer chose scissors. You win");
            }
        }else if (choice==2){
            if (computerChoice==1){
                System.out.println("You chose paper and computer chose rock. You win");
            }else if (computerChoice==2){
                System.out.println("You chose paper and computer chose paper. It is a draw");
            }else{
                System.out.println("You chose paper and computer chose scissors. Computer wins");
            }
        }else if (choice==3){
            if (computerChoice==1){
                System.out.println("You chose scissors and computer chose rock. Computer wins");
            }else if (computerChoice==2){
                System.out.println("You chose scissors and computer chose paper. You win");
            }else{
                System.out.println("You chose scissors and computer chose scissors. It is a draw");
            }
        }else{
            System.out.println("You have entered an invalid choice");
        }



        /*
        5. Write a program that calculates the grade of a student, given final, midterm, quiz1 and quiz2
exams. If student’s score is bigger than 90, student’s grade is A, if it is less than 90 and greater
than 80 grade is B.
Calculate the grades until 50
         */

        Scanner scanner5 = new Scanner(System.in);
        System.out.print("Please enter your final exam score :");
        int finalExam = scanner5.nextInt();
        System.out.print("Please enter your midterm exam score :");
        int midtermExam = scanner5.nextInt();
        System.out.print("Please enter your quiz1 score :");
        int quiz1 = scanner5.nextInt();
        System.out.print("Please enter your quiz2 score :");
        int quiz2 = scanner5.nextInt();

        int totalScore = finalExam+midtermExam+quiz1+quiz2;
        if (totalScore>90){
            System.out.println("Your grade is A");
        }else if (totalScore>80){
            System.out.println("Your grade is B");
        }else if (totalScore>70){
            System.out.println("Your grade is C");
        }else if (totalScore>60){
            System.out.println("Your grade is D");
        }else{
            System.out.println("Your grade is F");
        }


    }
}
