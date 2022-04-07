// Rotate the 2d array by 90 degee.....

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        
        // Anticlockwise rotation by 90 degree
        // for(int i=n-1;i>=0;i--)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         System.out.print(arr[j][i]+" ");
        //     }
        //     System.out.println();
        // }


        // Clockwise Rotation by 90 degree
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=0;j--)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }


    }
}
