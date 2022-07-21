import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShivamCode {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine().trim());

        List<Integer> result=replaceDigits(n);

        for(int j=0;j<result.size();j++)
        {
            System.out.println(result.get(j));
        }

    }
    public static List<Integer> replaceDigits(int n)
    {
        int temp=n;
        int sum=0;
        List<Integer> list=new ArrayList<>();
//        String snn=String.valueOf(x2);
//        StringBuilder snn=new StringBuilder(snn);
//        snn=snn.reverse();
//        snn=snn.toString();
//        sum2= Integer.parseInt(snn);
        if(n<=9)
        {
            list.add(1);
            list.add(9);
            return list;
        }
        int c=0;
        while (temp>0)
        {
            int r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
            c++;
        }
        if(sum<9)
        {
            list.add((int)Math.pow(10,c-1));
            list.add((int)Math.pow(10,c-1)*9);
            return list;

        }
        int sum3=sum;
        int digit2=0;

        while(sum3>0)
        {
            int r=sum3%10;
            if(r==1|| r==0)
            {
                sum3=sum3/10;
            }
            else{
                digit2=r;
                break;
            }
        }
        if(digit2==0)
        {
            digit2=1; //
        }
        int x2=0;
        int n2=n;
        while(n2>0)
        {
            int r=n2%10;
            if(r==digit2)
            {
                x2=x2*10+1;

            }
            else
                x2=x2*10+r;
            n2=n2/10;
        }
        int sum2=0;
        while(x2>0)
        {

//            String s=String.valueOf(x2);
//            StringBuilder s1=new StringBuilder(s);
//            s1=s1.reverse();
//            s=s1.toString();
//            sum2= Integer.parseInt(s);

            int r=x2%10;
            sum2=sum2*10+r;
            x2=x2/10;
        }
        list.add(sum2);
        int digit =0;
        while(sum>0)
        {
            int r=sum%10;
            if(r==9)
                sum=sum/10;
            else {
                digit = r;
                break;
            }
        }
        int x=0;
        while(n>0)
        {
            int r=n%10;
            if(r==digit)
                x=x*10+9;
            else
                x=x*10+r;
            n=n/10;
        }
        int sum1=0;

//        String sn=String.valueOf(x);
//        StringBuilder sn1=new StringBuilder(sn);
//        sn1=sn1.reverse();
//        sn=sn1.toString();
//        sum1= Integer.parseInt(sn);
        while(x>0)
        {
            int r=x%10;
            sum1=sum1*10+r;
            x=x/10;
        }
        list.add(sum1);
        return list;
    }
}
