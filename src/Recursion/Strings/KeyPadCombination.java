package Recursion.Strings;

import java.util.ArrayList;
import java.util.List;

public class KeyPadCombination {
    public static String [] map={".","abc","def","ghi","jkl","mno","pqrs","tu","vxy","yz"};
    public static void main(String[] args) {
        printKeyPad("23","",0);

    }

    public static void printKeyPad(String str,String p,int index)
    {
        if (index==str.length())
        {
            System.out.println(p);
            return;
        }


        char ch=str.charAt(index);
        String mapping=map[ch-'0'];
        for (int i=0;i<mapping.length();i++)
        {
            printKeyPad(str,p+mapping.charAt(i),index+1);
        }
//        List<String > list=new ArrayList<>();

    }
}
