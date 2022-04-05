// We are given an ladder of n steps and we can take either one step or two steps or three steps at a time.
// We have to find the number of ways we can reach to the top of the ladder starting from bottom.

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        System.out.println(recLadder(n));
    }


    static int recLadder(int n){
        //Base Case
        if(n==0)
        return 1;
        if(n<0)
        return 0;
        // else 
        // return n;
        // Recursive Case
        return recLadder(n-1)+recLadder(n-2)+recLadder(n-3);

    }
}
