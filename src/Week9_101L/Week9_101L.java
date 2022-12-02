package Week9_101L;

public class Week9_101L {

    //0. Write display methods for
    //a. Write a method that displays the given array in a single line, tab separated
    //b. Write a method that displays two-dimensional array, each row in a new line
    public static void display1DimensionArray(int[] array){
        System.out.println("One Dimensional array :    ");
        System.out.print("["+array[0]+"    ");
        for (int i = 1; i <array.length-1 ; i++) {
            System.out.print(array[i]+"    ");
        }
        System.out.println(array[array.length-1]+"]\n");
    }
    public static void display2DimensionArray(int[][] array){
        System.out.println("Two Dimensional array ;");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("    "+array[i][j]+"    ");
            }
            System.out.println("]");
        }

    }


    //1. Write a method that returns the sum of all the elements in a specified
    //a. Column
    //b. Row
    public static int sumColumn(int[][] matrix, int columnIndex){
        int sum = 0;
        for (int i = 0; i <matrix.length ; i++) {
            sum=sum+matrix[i][columnIndex];
        }

        return  sum;
    }
    public static int sumRow(int[][] matrix, int rowIndex){
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum=sum+matrix[rowIndex][i];
        }

        return sum;
    }







    public static void main(String[] args) {

        int[] array1D = {5,6,7,8,9,10,11,19,85,196};
        int[][] array2D = {{45,12,69},{14,56,48},{32,69,42},{10,11,12}};


        //Q0
        display1DimensionArray(array1D);
        display2DimensionArray(array2D);
        System.out.println("----------------------------------------------");

        //Q1
        System.out.println("Sum of the column is : " + sumColumn(array2D,0));
        System.out.println("Sum of the row is : " + sumRow(array2D,1));
        System.out.println("----------------------------------------------");




    }
}
