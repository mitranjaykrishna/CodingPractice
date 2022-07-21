import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n1="CHEnnAi";
        int n2=2;
        System.out.println(fun(n1,n2));
    }
    public static String fun(String input1,int input2)
    {
        String ans="";
        if(input2==0) {
            for (int i = 0; i < input1.length(); i++) {
                if (i == input2) {
                    ans = ans + input1.charAt(i);
                    input2 += 2;
                }
            }
        }
        else
        if(input2==1) {
            for (int i = 0; i < input1.length(); i++) {
                if (i == input2) {
                    ans = ans + input1.charAt(i);
                    input2 += 2;
                }
            }
        }
        else
        if(input2==2)
        {
            String nstr="";
            for (int i=0; i<input1.length(); i++)
            {
                char ch= input1.charAt(i);
                nstr= ch+nstr;
            }
            ans=nstr;
        }

        char[] temp=ans.toCharArray();
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]>='A' && temp[i]<='Z')
            {
                temp[i]=Character.toLowerCase(temp[i]);

            }
            else
            if(temp[i]>='a' && temp[i]<='z')
            {
                temp[i]=Character.toUpperCase(temp[i]);

            }
        }
        ans="";
        for(int i=0;i<temp.length;i++)
        {
            ans=ans+temp[i];
        }
        return ans;
    }
}
