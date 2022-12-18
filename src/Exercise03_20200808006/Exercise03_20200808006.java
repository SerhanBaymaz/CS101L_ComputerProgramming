package Exercise03_20200808006;

/*
    @ Ibrahim Baymaz - 20200808006
          11/12/2022 - 14/12/2022
 */
public class Exercise03_20200808006 {

    public static void main(String[] args) {


        System.out.println("---------------------------Question 1 start---------------------------");

        int[][] array2D = generateArray2D(4, 4, 0, 10);
        display2D(array2D);
        int diagonalSum = sumDiagonal(array2D);
        System.out.println("Sum of the diagonal for the given 2D array is: " + diagonalSum);
        System.out.println("---------------------------Question 1 end---------------------------\n");


        System.out.println("---------------------------Question 2 start---------------------------");


        int[][] employees = generateArray2D(8, 7, 4, 9);
        int[] workingHours = employeeWorkingHours(employees);
        System.out.println("Working hours of employees. Every row represent one person:");
        display2D(employees);
        System.out.println("Sum of working hours :");
        display(workingHours);
        System.out.println("---------------------------Question 2 end---------------------------\n");


        System.out.println("---------------------------Question 3 start---------------------------");

        int[][] matrixA = generateArray2D(3, 2, 1, 10);
        int[][] matrixB = generateArray2D(2, 3, 1, 10);
        display2D(matrixA);
        display2D(matrixB);

        int[][] productMatrix = dotProduct(matrixA, matrixB);
        display2D(productMatrix);

        System.out.println("---------------------------Question 3 end---------------------------\n");


        System.out.println("---------------------------Question 4 start---------------------------");

        double[][] points = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
                {26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35},
                {36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45},
                {46, 47, 48, 49, 50},
                {51, 52, 53, 54, 55},
                {56, 57, 58, 59, 60},
        };

        display2D(points);
        int[] closestPoints = getClosestPoints(points, 5);
        System.out.println("Indexes of points with closest distance");
        display(closestPoints);

        System.out.println("---------------------------Question 4 end---------------------------\n");


        System.out.println("---------------------------Question 5 start---------------------------");


        int numberForHeadNtails = 19;
        int[] binaryHali = decimalToBinary(numberForHeadNtails);
        display(binaryHali);


        char[][] charArray2D = headsNtails(numberForHeadNtails);
        display2D(charArray2D);


        System.out.println("---------------------------Question 5 end-------------------------------\n");


    }//main method


    // Question 1: Sum the major diagonal in a matrix
    public static int sumDiagonal(int[][] array2D) {
        /*
         * Write a method that sums all the numbers in the major diagonal
         * in an n x n matrix
         *
         * Args:
         *      array2D (int[n][n]) : two dimensional array of integers
         *
         * Returns:
         *      (int) : sum of all the numbers in the major diagonal
         */
        int sum = 0;
        for (int i = 0; i < array2D.length; i++) {
            sum += array2D[i][i];
            //it will add the diagonal elements.
            // For example, if the array is 4x4, it will add array[0][0], array[1][1], array[2][2], array[3][3]
            //so it will add the diagonal elements.
        }
        return sum;

    }


    // Question 2: Compute the weekly hours for each employee
    public static int[] employeeWorkingHours(int[][] employees) {
        /*
         * Suppose the weekly hours for all employees are stored in a
         * two-dimensional array. Each row records an employee's seven
         * day work hours with seven columns. Write a method that sorts the
         * employee's according to their sum of working hours for an enteire week
         * in decreasing order. Finally returns the sum of working hours for each
         * employee (sort both returned array and given employees array)
         *
         * Args:
         *      employees (int[8][7]) : the array of employees. Each row contains
         *      the employee's seven day work hours.
         *
         * Returns:
         *      int[8] : the array of sum working hours for each employee in decreasing order.
         */


        int[] sumOfWorkingHours = new int[employees.length];
        int tempSum = 0;
        for (int employeePerson = 0; employeePerson < employees.length; employeePerson++) {

            for (int weekDay = 0; weekDay < employees[employeePerson].length; weekDay++) {
                tempSum += employees[employeePerson][weekDay];
            }
            sumOfWorkingHours[employeePerson] = tempSum;
            tempSum = 0;

            //it will add the working hours of each employee.
            //For example, if the array is 8x7, it will add array[0][0]+ array[0][1], ... array[0][5]+ array[0][6]
            //so it will add the working hours of the first employee. Then it will add the working hours of the second employee.
            //and so on.

        }

        //sorting as a descending order.
        for (int i = 0; i < sumOfWorkingHours.length; i++) {
            for (int j = i + 1; j < sumOfWorkingHours.length; j++) {
                if (sumOfWorkingHours[i] < sumOfWorkingHours[j]) {
                    int temp = sumOfWorkingHours[i];
                    sumOfWorkingHours[i] = sumOfWorkingHours[j];
                    sumOfWorkingHours[j] = temp;
                }
            }
        }

        return sumOfWorkingHours;

    }

    // Question 3: multiply two matrices
    public static int[][] dotProduct(int[][] matrixA, int[][] matrixB) {
        /*
         * Write a method to multiply two matrices.
         *
         * Args:
         *      matrixA (int[m][n]) : the two-dimensional array of integers
         *      matrixB (int[n][k]) : the two-dimensional array of integers
         *
         * Returns:
         *      int[m][k] : the two-dimensional array of result dot product of
         *      matrixA and matrixB
         */
        int m = matrixA.length;
        int n = matrixA[0].length;
        int k = matrixB[0].length;
        int[][] result = new int[m][k];

        //do the matrix multiplication
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                for (int l = 0; l < n; l++) {
                    result[i][j] += matrixA[i][l] * matrixB[l][j];
                }
            }
        }

        //matrix multiplication formula is:
        //result[i][j] = sum(matrixA[i][l] * matrixB[l][j]) for l = 0 to n-1.

        return result;


    }


    // Question 4: All closest pairs of points
    public static int[] getClosestPoints(double[][] points, int pointIndex) {
        /*
         * Write a method that returns the array indices of the closest points to the given
         * point index. if m number of points share the same minimum distance to
         * given point index, then your array will have all of those points
         *
         * Args:
         *      points (double[n][d]) : array of n points in d dimensional space
         *      pointIndex (int) : index of a point from points array that we will search for closest m points
         *
         * Returns:
         *      (int[m]) : array of point indices that share the same minimum distance to given point
         */

        // Initialize array for storing point indices
        int[] closestPoints = new int[points.length];
        int numPoints = 0;

        // Calculate distance between each point and the given point
        double minDistance = 999999999;
        for (int i = 0; i < points.length; i++) {
            if (i == pointIndex) {
                continue;
            }
            double distance = distance(points[pointIndex], points[i]);
            if (distance < minDistance) {
                // Found a new minimum distance, so clear array and reset counter
                numPoints = 0;
                minDistance = distance;
            }
            if (distance == minDistance) {
                // Point has the same minimum distance as the given point, so add it to the array
                closestPoints[numPoints] = i;
                numPoints++;
            }
        }

        // Copy array to a new array of the correct size. This is necessary because the array may have extra elements at the end.
        int[] closestPointsCopy = new int[numPoints];
        for (int i = 0; i < numPoints; i++) {
            closestPointsCopy[i] = closestPoints[i];
        }
        return closestPointsCopy;




        /*
           what we have done here is:
                1. we have calculated the distance between the given point and all the other points.
                2. we have stored the distance in a variable called minDistance.
                3. we have compared the distance with the minDistance.
                4. if the distance is less than the minDistance, then we have stored the distance in the minDistance variable.
                5. if the distance is equal to the minDistance, then we have stored the index of the point in the closestPoints array.
                6. we have returned the closestPoints array.
         */

    }

    // Calculates the euclidean distance between two points in d dimensional space
    public static double distance(double[] pointA, double[] pointB) {
        /*
         * Helper method for calculating distance between given two points
         *
         * Args:
         *      pointA (double[d]) : a point in d-dimensional space
         *      pointB (double[d]) : a point in d-dimensional space
         *
         * Returns:
         *      (double): distance between given two points UP TO 1 DECIMAL PLACE
         */




        /*
                Euclidean distance formula:
           distance = sqrt((x1 - x2)^2 + (y1 - y2)^2 + ... + (z1 - z2)^2)
         */
        double distance = 0;
        for (int i = 0; i < pointA.length; i++) {
            distance += Math.pow(pointA[i] - pointB[i], 2);
        }

        return Math.round(Math.sqrt(distance) * 10) / 10.0;
        //We round the distance to 1 decimal place with division by 10.0 and multiplication by 10.

    }


    // Question 5: Nine heads and tails
    public static char[][] headsNtails(int number) {
        /*
         * Nine coins are placed in a 3-by-3 matrix with some face up and
         * some face down. You can represent the state of the coins using a
         * 3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:
         *      0 0 0       1 0 1       1 0 0
         *   A: 0 1 0    B: 0 0 1   C:  1 1 1
         *      0 0 0       1 0 0       1 1 0
         *
         *  Each state can also be represented using a binary number: For example,
         *  the preceding A, B and C matrices correspond to the numbers
         *      A: 0 0 0 0 1 0 0 0 0
         *      B: 1 0 1 0 0 1 1 0 0
         *      C: 1 0 0 1 1 1 1 1 0
         *
         *  There are a total of 512 posibilities, so you can use
         *  decimal numbers 0, 1, 2, ..., 511 to represent all states of the matrix.
         *      for A: number == 10
         *      for B: number == 332
         *      for C: number == 318
         *
         * Write a program that accepts a number and returns the corresponding matrix with
         * the characters H and T
         *
         *      if the number == 7;
         *      then the binary of 7 == 0 0 0 0 0 0 1 1 1;
         *      so in matrix format it will be;
         *              0 0 0
         *              0 0 0
         *              1 1 1
         *
         *      finally we can represent it with coins like;
         *              H H H
         *              H H H
         *              T T T
         *
         * Args:
         *      number (int): the number to represent with the characters H and T in matrix format
         *
         * Returns:
         *      (char[3][3]): the corresponding matrix representation of given number with coins
         */

        // Initialize return matrix
        char[][] returnMatrix = new char[3][3];

        // Converting number to binary representation and store it in an array.
        int[] binary = decimalToBinary(number);

        // Fill returnMatrix with characters
        int index = 0;
        for (int row = 0; row < returnMatrix.length; row++) {
            for (int column = 0; column < returnMatrix[row].length; column++) {
                if (binary[index] == 0) {
                    returnMatrix[row][column] = 'H';
                } else {
                    returnMatrix[row][column] = 'T';
                }
                index++;
            }
        }

        return returnMatrix;
    }

    // Converts the given decimal number to a binary represented with an array
    public static int[] decimalToBinary(int number) {
        /*
         * Helper method to convert the given decimal number to binary representation
         *
         * Args: number (int): the decimal number convert to binary
         * Returns: int[]: the binary representation of the given number
         */


        //array must be 9 digits long. For example, 7 is 111 in binary, but we need 00000111
        //so we need to pad the array with leading zeros

        int[] binary = new int[9];
        int index = 0;
        while (number > 0) {
            binary[index] = number % 2;
            number /= 2;
            index++;
        }

        //reverse the array
        for (int i = 0; i < binary.length / 2; i++) {
            int temp = binary[i];
            binary[i] = binary[binary.length - i - 1];
            binary[binary.length - i - 1] = temp;
        }

        return binary;
    }




    /////////////// HELPER METHODS ////////////////////////////

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void display(double[] array) {
        for (double i : array) {
            System.out.printf("%.1f\t", i);
        }
        System.out.println();
    }

    public static void display(int[] array) {
        for (int i : array) {
            System.out.printf("%d\t", i);
        }
        System.out.println();
    }

    public static void display(char[] array) {
        for (int i : array) {
            System.out.printf("%c\t", i);
        }
        System.out.println();
    }

    public static void display2D(int[][] array2D) {
        for (int[] row : array2D) {
            display(row);
        }
        System.out.println("--------------------------");
    }

    public static void display2D(double[][] array2D) {
        for (double[] row : array2D) {
            display(row);
        }
        System.out.println("--------------------------");
    }

    public static void display2D(char[][] array2D) {
        for (char[] row : array2D) {
            display(row);
        }
        System.out.println("--------------------------");
    }

    public static int[][] generateArray2D(int m, int n, int start, int end) {
        int[][] array2D = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array2D[i][j] = random(start, end);
            }
        }

        return array2D;
    }

    public static double[][] generateArray2D(int m, int n, double start, double end) {
        double[][] array2D = new double[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array2D[i][j] = round(random(start, end), 1);
            }
        }

        return array2D;
    }

    public static int random(int start, int end) {
        return start + (int) (Math.random() * (end - start + 1));
    }

    public static double random(double start, double end) {
        return start + Math.random() * (end - start + 1);
    }

    public static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

}//Exercise03_20200808006 class
