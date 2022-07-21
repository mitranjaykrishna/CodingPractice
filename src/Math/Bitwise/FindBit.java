package Math.Bitwise;

import java.util.Arrays;

public class FindBit {
    public static void main(String[] args) {
        int number=10;
        int[] binary = new int[8];
        for (int i = 8 - 1; 0 <= i; i--) {
            binary[i] = number % 2;
            // one shift to the right, basically divides with two
            // it's okay to change the incoming parameter as it's not a reference
            number = number >> 1;
        }
        System.out.println(Arrays.toString(binary));
    }
}
