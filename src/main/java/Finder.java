/* COMP 3700
   Assignment 2
   Simple class with two functions to find max and min numbers in arrays.
   Zihao Yan
   8.28.2019
 */

public class Finder {
    public Finder() {
        System.out.println("Initializing the Finder Class......");
    }

    //Find the max number in the array.
    public Integer findMax(int[] intArray) {
        if (intArray == null) {
            return null;
        }
        int max = intArray[0];
        for (int i = 1; i < intArray.length; i++){
            if (intArray[i] > max) {
                max = intArray[i];
            }
        }
        return max;
    }

    //Find the min number in the array.
    public Integer findMin(int[] intArray) {
        if (intArray == null) {
            return null;
        }
        int min = intArray[0];
        for (int i = 1; i < intArray.length; i++){
            if (intArray[i] < min) {
                min = intArray[i];
            }
        }
        return min;
    }
}
