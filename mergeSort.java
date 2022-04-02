// Implementing Merge Sort
// Time Complexity - O(nlogn)

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++)
            arr[i] = sc.nextInt();

        mergeSort(arr,0,n-1);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void mergeSort(int [] arr,int start,int end){
        if(start<end)
        {
            int mid = start+(end-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    static void merge(int [] arr,int start,int mid,int end){
        int asize = mid-start+1;
        int bsize = end-mid;
        int k=0;
        int a [] = new int[asize];
        int b [] = new int[bsize];
        
        for(int i=start;i<=mid;i++)
        {
            a[k] = arr[i];
            k++;
        }
        k=0;
        for(int i=mid+1;i<=end;i++)
        {
            b[k]= arr[i];
            k++;
        }
        int i=0,j=0;
        k=start;
        while(i<asize && j<bsize)
        {
            if(a[i]<b[j])
            {
                arr[k]= a[i];
                k++;
                i++;
            }
            else
            {
                arr[k]=b[j];
                k++;
                j++;
            }                
        }
        while(i<asize)
        {
            arr[k]=a[i];
            i++;
            k++;
        }
        while(i<bsize)
        {
            arr[k]=b[j];
            k++;
            j++;
        }

    }
}
