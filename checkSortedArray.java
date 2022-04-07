//Checking whether the array is sorted or not?
//Approach--> take the array and check its first and second are in order or not and if true then 
//            use copyOfRange method of arrays to copy arr from 1 to n and then again check

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        boolean x = checkSort2(arr,n);
        System.out.println(x);
    }
    static boolean checkSort(int[] arr, int n){
        // Base Condition --> if array have no element or 1 element then it is sorted
        if(n==1||n==0){
            return true;
        }
        if(arr[0]>arr[1])
        return false;
        // Recursion Case
        boolean x = checkSort(Arrays.copyOfRange(arr,1,n), n-1);    //copyOfRange makes a new array from previous array copying all the elements in the given range 
        return x;
    }
    static boolean checkSort2(int[] arr, int n){
        // Base Condition
        if(n==1||n==0)
        return true;
        // Recursion Case
        boolean x = checkSort2(Arrays.copyOfRange(arr,1,n),n-1);
        if(arr[0]>arr[1])
        return false;
        else 
        return x;

    }

}
