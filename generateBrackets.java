// WAP to generate all possible n pairs of balanced paranthesis '(' and ')'

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String output = "";
        generateBrackets(output,n,0,0,0);
    }
    static void generateBrackets(String s, int n, int open, int close, int i){
        if(i==2*n)
        {
            System.out.println(s);
            return;
        }
        
        // open
        if(open<n)
        {
            generateBrackets(s+"(", n, open+1, close, i+1);
            // return;
        }
        
        // close
        if(close<open)
        {
            generateBrackets(s+")",n, open, close+1, i+1);
            // return;
        }

    }
}
