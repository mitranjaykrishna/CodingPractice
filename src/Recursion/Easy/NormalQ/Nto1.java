package Recursion.Easy.NormalQ;

public class Nto1 {
    public static void main(String[] args) {
        printN(5);

    }

    public static void printN(int n)
    {
        if(n==1){
            System.out.print(1+" ");

            return;
        }
        System.out.print(n+" ");
        printN(n-1);
        System.out.print(n+" ");



    }
}
