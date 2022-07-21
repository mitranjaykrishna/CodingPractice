package JavaLearn;

public class TryCatch {
    public static void main(String[] args) {
        int a=4,b=2;
//        int c=a/b;
//        System.out.println(c);

        try
        {
            int c=a/b;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
