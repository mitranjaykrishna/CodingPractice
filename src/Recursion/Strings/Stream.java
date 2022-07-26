package Recursion.Strings;

public class Stream {
    public static void main(String[] args) {
        String a="baccappleaDb";
        System.out.println(skipAppNotApple(a));


    }
    public static void skip(String p,String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));

        } else
            skip(p + ch, up.substring(1));
    }

    // Returning String

    public static String skip2(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip2(up.substring(1));

        } else
            return ch+skip2(up.substring(1));
    }

    //Skip Apple

    public static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));

        } else
            return up.charAt(0)+skipApple(up.substring(1));
    }

    //Only Skip the App when is not equal to Apple

    public static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));

        }
        else
            return up.charAt(0)+skipAppNotApple(up.substring(1));
    }
}
