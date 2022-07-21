import java.util.*;

public class suyash {

    public static void main(String[] args) {
        Integer[] arr = {3,5,1,5,5 };
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        int p=0;
        for(int i=0;i<arr.length;i++)
        {
            p+=arr[i]*((int)Math.pow(10,i));
        }
        System.out.println(p);
    }


}
