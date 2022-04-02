// Quick Sort Algorithm

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();

        quickSort(arr,0,n-1);
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void quickSort(int [] arr,int start,int end){
        //Base Case
        if(start>=end)
            return;
        int p = partition(arr,start,end);
        quickSort(arr,start,p-1);
        quickSort(arr,p+1,end);
    }
    static int partition(int [] arr,int start,int end){
        int i= start;
        int pivot = arr[end];
        for(int j=start;j<=end-1;j++)
        {
            if(pivot<arr[j])
            {   int temp = arr[j];
                arr[j] = arr[i];
                arr[i]= temp;
                i++;
            }
        }
        int temp =arr[i];
        arr[i]=arr[end];
        arr[end]=temp;
        return i;
    
    } 
}
