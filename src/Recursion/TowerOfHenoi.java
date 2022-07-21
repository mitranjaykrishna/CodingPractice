package Recursion;

public class TowerOfHenoi {
    public static void main(String[] args) {
        towerOfHenoi(6,"S","H","D");

    }
    public static void towerOfHenoi(int n,String s,String h,String d)
    {
        if(n==1)
        {
            System.out.println("Transfer Disk"+n+" from "+s+" to "+d);
            return;
        }

        towerOfHenoi(n-1,s,d,h);
        System.out.println("Transfer Disk"+n+" from "+s+" to "+d);
        towerOfHenoi(n-1,h,s,d);
    }
}
