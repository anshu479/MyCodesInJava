import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String a = "";
        int p = (int)Math.pow(2,s.length());
        ArrayList<String> arr = new ArrayList<String>(p);
        sub(s, a, 0, arr);

        Collections.sort(arr);
        for(int i=0; i<p; i++)
        System.out.print(arr.get(i)+" ");
    }
    @SuppressWarnings("unchecked")
    public static void sub(String s, String a, int i, ArrayList arr){
        // base condtion 
        if(i == s.length())
        {
            arr.add(a); 
            return;
        }
        // recursive calls
        sub(s, a, i+1, arr);
        sub(s, a+s.charAt(i), i+1, arr);
   }
}
