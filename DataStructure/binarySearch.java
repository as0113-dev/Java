package DataStructure;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        //Binary search algorithm iterably and then recursively

        Scanner in = new Scanner(System.in);

        int[] array1 = new int[10];
        for(int i=0; i<array1.length; i++){
            array1[i] = i * 2;
        }
        System.out.println("pick EVEN number between 0 and 18 to");
        int num = in.nextInt();
        int indexFound = iterableBinarySearch(array1, num);
        int indexFound2 = recursiveBinarySearch(array1, num, array1.length-1, 0);

        if(indexFound == indexFound2)
            System.out.println(indexFound + " = "+ indexFound2);
        else
            System.out.println("Check algorithm, smthinf went wrong");
        in.close();
    }

    public static int iterableBinarySearch(int[] arr, int n){
        int high = arr.length - 1, low = 0;

        while(low <= high){
            int mid = (high + low) / 2;
            if(arr[mid] == n)
                return mid;
            else if(arr[mid] > n)
                high = mid - 1;
            else if (arr[mid] < n)
                low = mid + 1;
        }
        
        //if not found then return -1
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int k, int h, int l){
        if (l>h)
            return -1;
        int m = (h+l)/2;
        if (arr[m] == k){
            return m;
        }
        else if (arr[m] > k){
            return recursiveBinarySearch(arr, k, m-1, l);
        }
        else{
            return recursiveBinarySearch(arr, k, h, m+1);
        }
        
    }
}
