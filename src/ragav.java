import java.util.Locale;
import java.util.Scanner;

public class ragav {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str="Wipro technologie Banglore";
        str=reverse(str,1);
        System.out.println(str);

    }
    static String reverse(String str,int n)
    {
        String ans="";
        if(n==0)
        {
            String[] splited = str.split("\\s+");
            for(int i=0;i<splited.length;i++)
            {
                splited[i]=reverseString(splited[i]);
            }
            for(int i=0;i<splited.length;i++)
            {
                ans=ans + splited[i]+" ";
            }
            return ans.trim();
        }

        if(n==1)
        {
//            str=str.toLowerCase();
            String[] splited = str.split("\\s+");
            for(int i=0;i<splited.length;i++)
            {
                splited[i]=reverseString(splited[i]);
            }
            for(int i=0;i<splited.length;i++)
            {
//                char s=splited[i].charAt(0);
                if((splited[i].charAt(0))!=splited[i].charAt(splited.length-1))
                 splited[i] = Character.toUpperCase(splited[i].charAt(0)) + splited[i].substring(1);
            }

            for(int i=0;i<splited.length;i++)
            {
                ans=ans + splited[i]+" ";
            }
            return ans.trim();


        }
        return "WWWWWWWWW";

    }

    public static String reverseString(String str){
        char ch[]=str.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }
}
