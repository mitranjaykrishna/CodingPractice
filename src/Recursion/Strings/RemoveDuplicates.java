package Recursion.Strings;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        boolean[] map=new boolean[25];
        System.out.println(remove("abbccdaefeggghijkklmlnoop","",map,0));
//        System.out.println(Arrays.toString(map));


    }
    public static String remove(String str,String p,boolean[] map,int index)
    {
        if(index==str.length())
            return p;
        char ch=str.charAt(index);
        int key=ch-'a';
        if(map[key])
        {
            return  remove(str,p,map,index+1);
        }
        p+=ch;
        map[key]=true;
        return remove(str,p,map,index+1);

    }
}
