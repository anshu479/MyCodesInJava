// Print the array with no dublicates 

import java.util.*;
class Main{
    static void noDubl(int arr[],int n){
        int b[] = new int [n];
        int j=0;
        for(int i=0;i<n-1;i++)
        {

            if(arr[i]!=arr[i+1])
            {
                b[j] = arr[i];
                j++;
            }
        }
        b[j] = arr[n-1];
        for(int i=0;i<=j;i++)
            System.out.print(b[i]+" ");
    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        Arrays.sort(arr);
        noDubl(arr,n);
    }
}
