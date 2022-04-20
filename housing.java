// Along one side of a road there is a sequence of vacant plot of land.Each plot has a different area(non zero).
// So, the area forms a sequence A[1], A[2], ....., A[N].
// You want to buy K acres of land to built a house. You want to  find all segments of contigous plots(i.e., a subsection in the sequence) of whose sum is exactly K.

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();

        int start = 0;
        int end = 0;
        int wSum = arr[end];
        while(end<n)
        {
            if(wSum<k ) // expanding
            {
                if(end+1<n)
                {end++;
                wSum+=arr[end];}         
            }
            if(wSum == k)
            {
                System.out.println(start+" "+end);
                wSum -= arr[start];
                if(end+1<n)
                {end++;
                wSum += arr[end];
                start++;}
            }
            if(wSum>k) // Shrinking
            {   
                wSum -= arr[start];
                start++;
            }
            if(end>n)
            break;
        }        
    }
}
