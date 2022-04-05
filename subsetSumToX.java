// Given an array of integers find the number of subsets that adds to x

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        int x = sc.nextInt();
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        System.out.println(subsetSumToX(arr,n,0,x));
    }


    static int subsetSumToX(int arr[] , int n, int i, int x){
        // Base Case
        if(i==n)
        {
            if(x==0)
                return 1;
        return 0;
        }
        
        int inc = subsetSumToX(arr,n,i+1,x-arr[i]);
        int exc = subsetSumToX(arr,n,i+1,x);
        return inc + exc;
        
    }
}
