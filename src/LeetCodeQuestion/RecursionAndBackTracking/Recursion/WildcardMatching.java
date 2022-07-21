package LeetCodeQuestion.RecursionAndBackTracking.Recursion;

public class WildcardMatching {
    static Boolean [][] gl;
    public static void main(String[] args) {
        System.out.println(isMatch("aa","a"));

    }
    public static boolean isMatch(String s, String p) {
        gl=new Boolean[s.length()][p.length()];
        return wc(s,p,0,0);

    }

    public static boolean wc(String s,String p,int i,int j)
    {
        //Base
        if(i==s.length() && j==p.length()) return true;
        if(i==s.length())
        {
            for (int x=j;x<p.length();x++)
            {
                if(p.charAt(x)!='*')
                    return false;
            }
            return true;
        }
        if(j==p.length() && i!=s.length())
            return false;
        //*****
        if(gl[i][j]!=null)
        {
            return gl[i][j];
        }

        boolean ans=false;
        if(p.charAt(j)=='?' && wc(s,p,i+1,j+1))
        {
            ans=true;
        }
        else if(p.charAt(j)=='*')
        {
            if(wc(s,p,i,j+1))
                ans=true;
            if (wc(s,p,i+1,j+1))
                ans=true;
            if(wc(s,p,i+1,j))
                ans=true;
        }
        else
        {
            if (s.charAt(i)==p.charAt(j) && wc(s,p,i+1,j+1))
                ans=true;

        }
        gl[i][j]=ans;
        return ans;
    }
}
