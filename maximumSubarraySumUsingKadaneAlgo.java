// KADANE'S ALGORITHM
/*  Implement a function that takes an input of integers, and prints the maximum subarray sum that can be formed. 
    A subarray is defined as consecutive segment of the array. If all numbers are negative, then return 0.
    Input - {-1,2,3,4,-2,6,-8,3}
    Output - 13
*/
import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            count += arr[i];
            if(count>max)
            max = count;
            if(count<0)
            count = 0;
        }  
        System.out.println(max);   
    }
}
