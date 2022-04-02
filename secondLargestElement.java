//finding the second largest number in the given array

import java.util.*;
class Main{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            first = Math.max(arr[i],first);
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=first)
                second = Math.max(arr[i],second);
        }
        if(second == Integer.MIN_VALUE)
            System.out.println("No second largest");
        else
            System.out.println(second);

    }
}
