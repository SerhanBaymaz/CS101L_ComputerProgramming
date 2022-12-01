package Week8_101L;

public class Week8_101L {

    //1. Write a method that displays the given array
    public static void displayArr(int arr[]){
        System.out.print("["+ arr[0]+ ", ");
        for (int i = 1; i < arr.length-1; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println(arr[arr.length-1]+ "]");

    }


    //2. Write a method that generates and returns an array of random numbers between given
    //minimum and maximum values with given length
    public static int[] generateArr(int min, int max, int lenght){
        int[] returnArr = new int[lenght];
        int range = max-min+1;
        for (int i = 0; i <lenght ; i++) {
            returnArr[i] = min+ (int)(Math.random()*range);
        }
        return returnArr;
    }


    //3. Write a method that searches a given array for a given key and returns the index if the given key
    //exists in the list. If not, returns -1
    public static int findElement(int[] arr, int key){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key)
                index=i;
        }

        return index;
    }


    //4. Write a method that finds the occurrences of each value in a given array.
    public static void findOccurences(int[] arr){
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            int lookigThisNumber = arr[i];

            if (arr[i]!=-999){

                for (int j = 0; j <arr.length ; j++) {
                    if (lookigThisNumber==arr[j]){
                        count++;
                        arr[j]=-999;
                    }
                }

                System.out.println("The number "+lookigThisNumber+" is repeated "+count+" times");
                count = 0;

            }
        }
    }



    public static void main(String[] args) {

        //Q1
        int[] myArray = {1,2,2,3,3,3,4,4,4,4,9,9,9,14,12,36,96,14,12,14};
        System.out.print("Your array is : ");
        displayArr(myArray);

        //Q2
        System.out.print("Random array is : ");
        displayArr(generateArr(10,36,50));

        //Q3
        System.out.println("Key in the arrays' index is : "+findElement(myArray,5));

        //Q4
        findOccurences(myArray);











    }
}
