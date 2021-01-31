//import java.util.Scanner;

/**
 * Hello
 */
public class demo {

    public static void main(String[] args) {
        int[] arr = {10,5,20,10};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(myPickTrees(arr2));
        System.out.println(myPickTrees(arr));
        
    }

    public static int myPickTrees(int[] arr){
        if(arr.length < 1){
            return 0;
        }else if(arr.length < 2){
            return arr[0];
        }else if(arr.length < 3){
            return Math.max(arr[0], arr[1]);
        }
        return myPickTrees(arr, 0);
    }

    public static int myPickTrees(int[] arr, int i){
        if(i >= arr.length){
            return 0;
        }else if(i == arr.length - 1){
            return arr[i];
        }
        int option1 = arr[i] + myPickTrees(arr, i+2);
        int option2 = arr[i+1] + myPickTrees(arr, i+3);

        return Math.max(option1, option2);
    }
}