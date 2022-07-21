package Math.Bitwise;
// Google Question :-  https://leetcode.com/problems/flipping-an-image/#

import java.util.Arrays;

public class FlippingAnImg {
    public static void main(String[] args) {

        int [][] arr={{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
//        System.out.println(Arrays.deepToString(xor(arr)));


    }
    public static int[][] flipAndInvertImage(int[][] image)
    {
        for(int i=0;i<image.length;i++)
        {
            int s=0;
            int e=image[i].length-1;
            while(s<=e)
            {
                int temp=image[i][s]^1;
                image[i][s]=image[i][e]^1;
                image[i][e]=temp;
                s++;
                e--;
            }
        }

        return image;

    }


}
