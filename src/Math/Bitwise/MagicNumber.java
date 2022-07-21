package Math.Bitwise;

public class MagicNumber {
    public static void main(String[] args) {
        int n=6;
        int i=1;
        int base=5;
        int ans=0;
        while(n>0)
        {
            ans+=(int)((n&1)*(Math.pow(base,i)));
            n=n>>1;
            i++;
        }
        System.out.println(ans);
    }
}
