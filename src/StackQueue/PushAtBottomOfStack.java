package StackQueue;

import java.util.*;

public class PushAtBottomOfStack {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s,4);
        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }

    }

    public static  void pushAtBottom(Stack<Integer> s, int target )
    {
        if(s.isEmpty())
        {
            s.push(target);
            return ;
        }

        int val=s.pop();

        pushAtBottom(s,target);
        s.push(val);


    }
}
