package DataStructure;

import java.util.ArrayList;

public class QuickSort {
    
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add(4);
        list1.add(3);  
        //Add elements in list2
        for (int i = 0; i < 10; i++) {
            list2.add((int) (Math.random()*100)+1);
        }
        System.out.println("Before quickSort: " + list1);
        System.out.println("After quickSort: "+quickSort(list1));

        System.out.println("Before quickSort: "+ list2);
        System.out.println("After quickSort: "+ quickSort(list2));
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr){
        //if 1 element in array then return arr
        if(arr.size() < 2){
            return arr;
        }
        //pick last element to be the pivot
        int pivot = arr.get(arr.size()-1);
        //create left and right arrayLists
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        //for each el in arr:
        //  if pivot >= el then add it to the right list
        // else add el to the left list    
        for (int i = 0; i < arr.size()-1; i++) {
            if(arr.get(i) <= pivot){
                left.add(arr.get(i));
            }else{
                right.add(arr.get(i));
            }
        }
        //Need to call quicksort on left arrayList and then concatinate with pivot 
        //and then concatinate that with right arrayList.
        left = quickSort(left);
        left.add(pivot);
        left.addAll(quickSort(right));
        return left;
    }
}
