// String is given and we have to convert string into integer.

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        System.out.println(convertStrToInt(s));
    }
    public static int convertStrToInt(String s){
        if(s.length()==0)
        {
            return 0;
        }
        return (s.charAt(s.length()-1)-'0')+convertStrToInt(s.substring(0,s.length()-1))*10;
        
    }
}
