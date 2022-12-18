package quiz2_20200808006;

public class Quiz2_20200808006 {
    public static void main(String[] args) {
        System.out.println("---------------------Question 1s---------------------");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 6, 7, 8,2,1};
        int[] arrWithoutDuplicate = eliminateDuplicates(arr);

        //display the array
        for (int i = 0; i < arrWithoutDuplicate.length; i++) {
            System.out.print(arrWithoutDuplicate[i] + " ");
        }
        System.out.println();

        System.out.println("---------------------Question 1e---------------------\n");


        System.out.println("---------------------Question 2s---------------------");

        System.out.println("---------------------Question 2e---------------------\n");



        System.out.println("---------------------Question 3s---------------------");
        int[][] workingHours = {
                {1,2,3,4,5,6,7},
                {8,9,10,11,12,13,14},
                {15,16,17,18,19,20,21},
                {22,23,24,25,26,27,28},
                {8,7,6,5,4,3,2},
                {12,18,19,20,21,22},
        };

        int[] sumOfWorkingHours = employeeWorkingHours(workingHours);
        for (int i = 0; i <sumOfWorkingHours.length; i++) {
            System.out.print(sumOfWorkingHours[i]+", ");
        }
        System.out.println();

        System.out.println("---------------------Question 3e---------------------\n");


        System.out.println("---------------------Question 4s---------------------");

        for (int i = 0; i < 20; i++) {
            int randomSayi = random(0,19,1,2,3);
            System.out.print(randomSayi+", ");
        }
        System.out.println();

        System.out.println("---------------------Question 4e---------------------\n");


    }

    //Question 1
    public static int[] eliminateDuplicates(int[] array) {
        int[] resultArray = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                resultArray[count] = array[i];
                count++;
            }
        }


        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = resultArray[i];
        }
        return result;

    }



    //Question 2
    public static int[] getClosestPoints(double[][] points, int index) {
        //find the closest points.
        double[] distances = new double[points.length];
        for (int i = 0; i < points.length; i++) {
            double distance = 0;
            for (int j = 0; j < points[i].length; j++) {
                distance += Math.pow(points[i][j] - points[index][j], 2);
            }
            distances[i] = Math.sqrt(distance);
        }

        //find the minimum distance.
        double minDistance = distances[0];
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] < minDistance) {
                minDistance = distances[i];
            }
        }

        //find the number of points that have the same minimum distance.
        int count = 0;
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] == minDistance) {
                count++;
            }
        }

        //find the indices of points that have the same minimum distance.
        int[] result = new int[count];
        int indexResult = 0;
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] == minDistance) {
                result[indexResult] = i;
                indexResult++;
            }
        }

        return result;
    }




    //Question 3
    public static int[] employeeWorkingHours(int[][] array) {
        int[] result = new int[array.length];

        //firstly we have to calculate person's work hour.
        for (int employeePerson = 0; employeePerson < array.length; employeePerson++) {
            int sum = 0;
            for (int workDay = 0; workDay < array[employeePerson].length; workDay++) {
                sum += array[employeePerson][workDay];
            }
            result[employeePerson] = sum;
        }

        //then we do th decreasing order.
        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] < result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                    int[] tempArray = array[i];
                    array[i] = array[j];
                    array[j] = tempArray;
                }
            }
        }
        return result;
    }




    //Question 4
    public static int random(int min, int max, int... excludedNumbers) {
        int randomNumber = (int) (Math.random() * (max - min + 1) + min);
        for (int i = 0; i < excludedNumbers.length; i++) {
            if (randomNumber == excludedNumbers[i]) {
                randomNumber = (int) (Math.random() * (max - min + 1) + min);
                i = -1; //we have to start from the beginning of the array.Because of this i must start with -1.
            }
        }
        return randomNumber;
    }

}

