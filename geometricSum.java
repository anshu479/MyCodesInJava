// Gsum---> 1+(1/2)+(1/2^2)+(1/2^3)+....+(1/2^k)
// k will be give ......and we have to provide G sum


import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        double sum = gSum(k);
        System.out.println(sum);
    }

    static double gSum(int k){
        // base case
        if(k==0)
        return 1;
        // Recursion case
        double x = gSum(k-1);
        // Calculation 
        return x+(1/Math.pow(2,k));
    }
}
