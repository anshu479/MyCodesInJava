/* Given an expression string, write a program to check all the pairs of paranthesis are valid.
Input -
    ((a+b)*x-d)
    ((a+b]+c)*(d-e)
Output - 
    True
    False
*/

import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[' || s.charAt(i)=='(' || s.charAt(i)=='{')
            st.push(s.charAt(i));
            else if(s.charAt(i)==']')
                {
                    if(st.peek()=='[')
                    st.pop();
                }
            else if(s.charAt(i)==')')
                {
                    if(st.peek()=='(')
                    st.pop();
                }
            else if(s.charAt(i)=='}')
                {
                    if(st.peek()=='{')
                    st.pop();
                }
        }
        if(st.isEmpty())
        System.out.println("True");
        else
        System.out.println("False");
    }
}
