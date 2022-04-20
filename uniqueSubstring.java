/*Given a string, write a function to find the largest substring with unique characters(no duplicates)
        Sample Input -
        aabcb
        Sample Output - 
        abc
*/
import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextInt();
        int i=0;
        int j=0; 
        int count = 0;   // length of each unique substring
        int maxLength = 0;   // length of max substring 
        int startOfMaxWindow = -1;  /// this will give me the index of start of max substring
        HashMap<Character, Integer> map = new HashMap<>();
        while(j<s.length())
        {
            if(!map.containsKey(s.charAt(j)))
            {
                map.put(s.charAt(j),j);
                j++;
            }    
            else
            {
                
            }
        }
    }
}
