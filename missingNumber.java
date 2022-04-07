// Given an array of size n-1, starting from 1 to n with 1 element is missing. Find that element with O(n) complexicity.

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++)
        arr[i]=sc.nextInt();

        int sum =0;
        for(int i=0;i<n-1;i++)
        {
            sum+=arr[i];
        }
        int total = n*(n+1)/2;
        System.out.println(total-sum);
        
    }
}
