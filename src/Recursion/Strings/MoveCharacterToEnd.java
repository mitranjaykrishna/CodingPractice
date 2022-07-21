package Recursion.Strings;

public class MoveCharacterToEnd {
    public static void main(String[] args) {
        System.out.println(solve("axbcxxd","",0));

    }
    public static int count=0;
    public static  String solve(String str,String p,int index)
    {
        if(index==str.length())
        {
            if(count!=0)
            {
                for (int i=0;i<count;i++)
                {
                    p=p+'x';
                }
            }
            return p;
        }

        char ch=str.charAt(index);
        if(ch=='x')
        {
            count++;
            return solve(str,p,index+1);
        }
        p=p+ch;
        return solve(str,p,index+1);

    }
}
