package Exercise02_20200808006;

public class Exercise02_20200808006 {

    public static void main(String[] args) {
        // Question 1
        System.out.println("--------------------Question 1--------------------");
        int[] students = new int[10];
        for (int i = 0; i < students.length; i++) {
            students[i] = random(0, 100);
        }

        System.out.println("Scores of students:");
        display(students);

        char[] grades = grade(students);

        System.out.println("Grades of students are:");
        display(grades);
        System.out.println("--------------------Question 1--------------------");

        System.out.println();


        // Question 2

        System.out.println("--------------------Question 2--------------------");
        int[] numbers = new int[8];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random(0, 10);
        }
        display(numbers);
        System.out.println("Average of numbers is: " + average(numbers));

        double[] doubleNumbers = new double[8];
        for (int i = 0; i < doubleNumbers.length; i++) {
            doubleNumbers[i] = random(-0.5, 0.5);
        }
        display(doubleNumbers);
        System.out.println("Average of numbers is: " + average(doubleNumbers));
        System.out.println("--------------------Question 2--------------------");
        System.out.println();



        // Question 3
        System.out.println("--------------------Question 3--------------------");

        int[] numbers2 = new int[10];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = random(0, 10, 1, 3, 5, 7, 9);
        }
        System.out.println("Generated numbers are: ");
        display(numbers2);

        System.out.println("--------------------Question 3--------------------");
        System.out.println();

        // Question 4
        System.out.println("--------------------Question 4--------------------");
        int[] numbers3 = new int[10];
        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = random(0, 10, 0, 1, 3, 5, 7, 9);
        }
        System.out.println("Generated numbers with duplicate values are: ");
        display(numbers3);
        int[] nonDuplicateNumbers = eliminateDuplicates(numbers3);
        
        System.out.println("Non duplicate numbers");
        display(nonDuplicateNumbers);
        System.out.println("--------------------Question 4--------------------");
        System.out.println();

        // Question 5
        System.out.println("--------------------Question 5--------------------");
        int[] numbers4 = new int[10];
        for (int i = 0; i < numbers4.length; i++) {
            numbers4[i] = i;
        }
        System.out.println("is array in sorted order: " + isSorted(numbers4));
        display(numbers4);

        shuffle(numbers4);

        System.out.println("is array in sorted order: " + isSorted(numbers4));
        display(numbers4);
        System.out.println("--------------------Question 5--------------------");
        System.out.println();


        // Question 6
        System.out.println("--------------------Question 6--------------------");
        int n = 100;
        boolean[] lockers = new boolean[n];
        int[] openLockers = lockers(lockers);

        System.out.println("for n == 100, Open lockers are:");
        display(openLockers);

        System.out.println("for n == 100, open locker amount should be 10: open locker amount: " + openLockers.length);

        System.out.println("\n");
        int n1 = 1000;
        boolean[] lockers1 = new boolean[n1];
        int[] openLockers1 = lockers(lockers1);

        System.out.println("for n == 1000, Open lockers are:");
        display(openLockers1);


        System.out.println("for n == 1000, open locker amount should be 31, open locker amount: " + openLockers1.length);
        System.out.println("--------------------Question 6--------------------");
        System.out.println();
    }

    // Question 1: Assign grades
    public static char[] grade(int[] students) {
        //initializing the return array.
        char[] resultList = new char[students.length];


        //finding best score
        int bestScore =0;
        for (int i = 0; i < students.length; i++) {
            if (students[i]>=bestScore)
                bestScore=students[i];
        }

        //assigning grades
        for (int i = 0; i < students.length; i++) {
            if (students[i]>=bestScore-10){
                resultList[i]='A';
            } else if (students[i]>=bestScore-20) {
                resultList[i]='B';
            } else if (students[i]>=bestScore-30) {
                resultList[i]='C';
            } else if (students[i]>=bestScore-40) {
                resultList[i]='D';
            }else {
                resultList[i]='F';
            }
        }

        return resultList;

    }
    // finds the maximum value from the given array
    public static int getMax(int[] array) {
        /*
         * Helper method for finding the maximum value from an array
         * 
         * Args: array int[]: array of integers
         * Returns: int: maximum value in the array
         */

        //finding best score
        int maxValue =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>=maxValue)
                maxValue=array[i];
        }

        return maxValue;

    }



    // Question 2: Average an array:
    public static int average(int[] array) {
        int sumOfArray=0;
        for (int i = 0; i < array.length; i++) {
            sumOfArray+=array[i];
        }
        int average = sumOfArray/array.length;

        return average;
    }
    // Overload the above method for double data type:
    public static double average(double[] array) {
        double sumOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfArray+=array[i];
        }
        double average = sumOfArray/array.length;

        return average;
    }


    // Question 3: Random number chooser
    public static int random(int start, int end, int... exclude) {

        int random = (int) (Math.random() * (end - start + 1) + start);
        for (int i = 0; i < exclude.length; i++) {
            if (random==exclude[i]){
                random = (int) (Math.random() * (end - start + 1) + start);
                i=-1;
                //i=-1 because i++ will make it 0 again.If we don't do this,
                // the loop will skip the first element of exclude array.
                //So we need to check the first element again.
            }
        }
        return random;
    }

    // Question 4: Eliminate duplicates
    public static int[] eliminateDuplicates(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j   &&   array[i] == array[j]) {
                    //if there is a duplicate, we will replace it with -9999
                    array[j] = -9999;

                }
            }
        }

        //finding the amount of non duplicate elements
        int nonDuplicateAmount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=-9999)
                nonDuplicateAmount++;
        }

        //creating the new array
        int[] nonDuplicateArray = new int[nonDuplicateAmount];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=-9999){
                nonDuplicateArray[index] = array[i];
                index++;
            }
        }

        return nonDuplicateArray;


    }



    // Question 5: Sorted?
    public static boolean isSorted(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }

        return true;

    }
    // shuffle the array randomly
    public static void shuffle(int[] array) {
            for (int i = 0; i < array.length; i++) {
                int randomIndex = (int) (Math.random() * array.length);
                int temp = array[i];
                array[i] = array[randomIndex];
                array[randomIndex] = temp;
            }
    }


    // Question 6: Locker puzzle
    public static int[] lockers(boolean[] locker) {


        int dolapSayisi = locker.length;

        // Her bir kapı için bir dizi oluşturalım.
        int[] lockersAsInt = new int[dolapSayisi+1];


        //her öğrenci için switch işlemini yapalım.
        for (int ogrenci = 1; ogrenci <= dolapSayisi; ogrenci++) {
            for (int dolapNo = 1; dolapNo <= dolapSayisi; dolapNo++) {
                if(dolapNo%ogrenci==0){

                    int temp =lockersAsInt[dolapNo];
                    if(temp==0){
                        lockersAsInt[dolapNo]=1;
                    }else{
                        lockersAsInt[dolapNo]=0;
                    }

                }
            }
        }





        //kaç tane açık kapı olduğunu bulalım.
        int numberOfOpenLocker =0;
        for (int i = 1; i <= dolapSayisi; i++) {
            if(lockersAsInt[i]==1){
                numberOfOpenLocker++;
            }
        }


        //hangi dolapların açık olduğunu bulup, bu indisleri return arrayimize ekleyelim.
        int[] indexNumbersArray = new int[numberOfOpenLocker];//return this array
        int index =0;
        for (int i = 1; i <= dolapSayisi; i++) {
            if(lockersAsInt[i]==1){
                indexNumbersArray[index++]=i;
            }
        }


        return indexNumbersArray;
    }


    ////////////////////// HELPER FUNCTIONS //////////////////////

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



}//end of class

