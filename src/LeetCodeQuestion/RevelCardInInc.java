package LeetCodeQuestion;
//https://leetcode.com/problems/reveal-cards-in-increasing-order/


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class RevelCardInInc {
    public static void main(String[] args) {

        int[] arr={17,13,11,2,3,5,7};
        System.out.println(Arrays.toString(deckRevealedIncreasing(arr)));
    }
    public static int[] deckRevealedIncreasing(int[] deck) {

        Arrays.sort(deck);
        int size=deck.length;
        Deque<Integer> list=new LinkedList<>();
        size--;
        list.add(deck[size]);
        size--;
        list.addFirst(deck[size]);
        for(int i=size-1;i>=0;i--)
        {
            int vl=list.pollLast();
            list.addFirst(vl);
            list.addFirst(deck[i]);


        }
        int [] obJ=new int[deck.length];
        int j=0;
        for (int i :list)
        {
            obJ[j]=i;
            j++;
        }
        return obJ;

    }
}
