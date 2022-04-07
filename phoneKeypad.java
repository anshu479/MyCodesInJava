// Given a number n and a modern phone Keypad. Find out all the possible strings generated using that number.
// 23 -> AD, AE, AF, BD, BE, BF, CD, CE, CF 


import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String o = "";
        String Keypad[]= new String[] {"", "" , "ABC", "DEF", "GHI", "JKL", "MNO" , "PQRS", "TUV" , "WXYZ"};
        phoneKeypad(s,o,0,Keypad);
    }
    static void phoneKeypad(String s, String o, int i,String[] k){
        // base case
        
        if(i == s.length())
        {
            System.out.print(o);
            System.out.println();
            return;
        }
        // recursive case
        int current_digit =  s.charAt(i)-'0';
        if(current_digit == 1 || current_digit == 0)
        {
            phoneKeypad(s, o , i+1,k);
        }
        for(int j=0; j<k[current_digit].length(); j++)
        {
            phoneKeypad(s,o+k[current_digit].charAt(j),i+1,k);
        }

    }

}
