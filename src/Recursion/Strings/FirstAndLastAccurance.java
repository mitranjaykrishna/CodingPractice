package Recursion.Strings;

public class FirstAndLastAccurance {
    public static int first=-1;
    public static int last=-1;
    public static void main(String[] args) {
        firstAndLast("aabssadqh",0,'a');
        System.out.println(first+" "+last);

    }
    public static void firstAndLast(String str,int index,char ch) {
        if (index == str.length())
            return;


        if (ch == str.charAt(index)) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
            firstAndLast(str, index + 1, ch);
        } else {
            firstAndLast(str, index + 1, ch);

        }
    }
}
