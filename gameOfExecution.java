// Problem Statement
// To seek revenge on Midgard, Loki devises a plan to torture the humans by making them take part in one of his silly games. He makes N people sit in a circle. He says he will kill every kth person sitting in the circle, starting from 1st person.
// Loki performs his revenge prank until and unless 1 survivor remains.
// What is the initial position of the survivor, if the indexing is clockwise?


import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(josephus(n,k));
    }
    static int josephus(int n , int k){
        if(n==1)
        {
            return 1;
        }
        return (josephus(n-1,k) + k - 1) % n + 1;
    }
}
