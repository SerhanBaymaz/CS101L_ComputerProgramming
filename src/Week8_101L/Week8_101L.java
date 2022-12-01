package Week8_101L;

import java.util.Arrays;

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
        //firstly duplicate the array.
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] =arr[i];
        }


        int count=0;

        for (int i = 0; i < array.length; i++) {
            int lookigThisNumber = array[i];

            if (array[i]!=-999){

                for (int j = 0; j <array.length ; j++) {
                    if (lookigThisNumber==array[j]){
                        count++;
                        array[j]=-999;
                    }
                }

                System.out.println("The number "+lookigThisNumber+" is repeated "+count+" times");
                count = 0;

            }
        }
    }


    //5.Write a method that reverses a given array
    public static int[] reverseArr(int[] arr){
        int[] array = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[arr.length-1-i];
        }
        return array;
    }


    //6. Implement the binary search algorithm for a given array and key
    public static int findElementBinary(int[] arr,int element){
        int index = -1;
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;

        while (low<=high){
            if (arr[mid]==element){
                index = mid;
                break;
            }
            else if (arr[mid]<element){
                low = mid+1;
            }
            else if (arr[mid]>element){
                high = mid-1;
            }
            mid = (low+high)/2;
        }

        return index;
    }



    public static void main(String[] args) {

        //Q1
        int[] myArray = {1,2,2,3,3,3,4,4,4,4,9,9,9,14,12,36,96,14,12,14,11};
        System.out.print("Your array is : ");
        displayArr(myArray);

        //Q2
        System.out.print("Random array is : ");
        displayArr(generateArr(10,36,50));

        //Q3
        System.out.println("Key in the arrays' index is : "+findElement(myArray,5));

        //Q4
        findOccurences(myArray);

        //Q5
        displayArr(myArray);
        displayArr(reverseArr(myArray));

        //Q6
        Arrays.sort(myArray);
        System.out.println("Key in the arrays' index is : "+findElementBinary(myArray,11));












    }
}
