// Finding 1st largest 2nd largest and lowest in an array without sorting

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int last = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(first<arr[i])
            first = arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==first)
            i++;
            else if(second<arr[i])
            second = arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(last>arr[i])
            last = arr[i];
        }
        System.out.println("First Largest->" + first);
        System.out.println("Second Largest->" + second);
        System.out.println("Lowest->"+  last);
    }
}
