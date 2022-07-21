package InfyTQ;
import java.util.*;
import java.io.*;

import java.util.Scanner;

public class Q3String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] arr = string.split(",");
        for(int i = 0;i<arr.length;i++){
            if(arr[i].indexOf('6')!=-1){
                String s = arr[i];
                s= s.replaceAll("6","9");
                s = reverse(s);
                arr[i] = s;
            }
        }
        // for(String s: arr)
        //     System.out.println(s);
        int sum = 0;
        for(String s: arr){
            sum = sum+ (Integer.parseInt(s));
        }
        double avg = sum/arr.length;
        System.out.println(avg);
    }
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            sb.append(c);
        }
        sb.reverse();
        return sb.toString();
    }
    }



