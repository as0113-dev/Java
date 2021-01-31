package DataStructure;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
    /*Bubble Sort explained:   
     * sorts given array by swapping elements
     * Parent for loop runs from i=0 --> i< arr.length-1
        1) Because when reaches arr.length-2 it wil compare w/ arr.length-1
           and not go out of bound.
     * inner for loop for(j) is where we compare elements and swap when needed
        1) --> arr[j] > arr[j+1] <-- if this condition is met then
           we swap elements, else we keep moving.
     * Worst case: O(n) = n^2
     * Best case: O(n) = n, because its already sorted to begin with.
     * 
    */
       int[] a = {10, 3, 5, 11, 0};
       int[] s = bubbleSort(a);
       System.out.println(Arrays.toString(s));
    }

    public static int[] bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                //compare arr[j] value if bigger than arr[j+1] value next to it
                if(arr[j] > arr[j+1]){
                    //swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    //display array's order to see what was swapped
                    printArr(arr);
                }
                else{
                    System.out.println("NO SWAP: "+arr[j]+" > "+arr[j+1]);
                }
            }
        }
        return arr;
    }
    //method for printing Arrays
    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}