import java.util.Scanner;

public class ifosys {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        int x=6;
        int y=2;
        int c;
        if(x<y)
        {
//                return -1;
            System.out.println("-1");

        }
        while(x>y)
        {

            c= C(x,y);
            if(c==y)
            {
//                return y;
                System.out.println(y);
                break;
            }

            y++;
        }
    }
    public static int C(int x,int y)
    {


        if(x<y)
        {
            return x;
        }
        return C(x/y,y)+x%y;
    }


}
