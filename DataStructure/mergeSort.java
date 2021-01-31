package DataStructure;

import java.util.Arrays;

public class mergeSort {

    public static void main(String[] args) {
        int[] test = {10,1,8,4,0,5};
        int[] sorted = myMergeSort(test);
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] myMergeSort(int[] arr){
        //base case
        if(arr.length <= 1)
            return arr;

        //find midpoint
        int mid = (arr.length) / 2;
        
        //split into left array with size from 0 --> mid
        int[] leftSplit = new int[mid];
        //split into right array with size from mid --> last index
        int[] rightSplit = new int[arr.length - mid];

        //fill the leftSplit and rightSplit array with values from arr
        for (int i = 0; i < mid; i++) {
            leftSplit[i] = arr[i];
        }
        for (int j = mid; j < arr.length; j++) {
            rightSplit[j-mid] = arr[j];
        }

        int[] sortedLeft = myMergeSort(leftSplit);
        int[] sortedRight = myMergeSort(rightSplit);

        return merge(sortedLeft, sortedRight);


    }

    public static int[] merge(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int resIndex = 0;
        int leftIndex = 0 ,rightIndex = 0;
        while(leftIndex < arr1.length && rightIndex < arr2.length){
            if(arr1[leftIndex] < arr2[rightIndex]){
                result[resIndex] = arr1[leftIndex];
                leftIndex++;
                resIndex++;
            }else{
                result[resIndex] = arr2[rightIndex];
                rightIndex++;
                resIndex++;
            }
        }
        if (leftIndex == arr1.length){
            for (int i = rightIndex; i < arr2.length; i++) {
                result[i+leftIndex] = arr2[i];
            }
        }else{
            for (int i = leftIndex; i < arr1.length; i++) {
                result[i+rightIndex] = arr1[i];
            }
        }

        return result;
    }
}