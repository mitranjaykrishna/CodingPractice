package Tree;

import java.util.*;

public class GenericTreePepCoding {
   static class Node{
        int data;
        ArrayList<Node> children=new ArrayList<>();
    }

    public static void main(String[] args) {
        int [] arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,2,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Stack<Node> st=new Stack<>();
        Node root=null;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==-1)
            {
                st.pop();
            }
            else
            {
                Node t=new Node();
                t.data=arr[i];
                if(st.size()>0)
                {
                    st.peek().children.add(t);
                }
                else{
                    root=t;
                }
                st.push(t);

            }
        }
        display(root);
        System.out.println(count(root));
        System.out.println(max(root));
        System.out.println(height(root));
    }
    public static void display(Node root)
    {
        String str=root.data+"-> ";
        for(Node child:root.children)
        {
            str+=child.data+",";
        }
        str+=".";
        System.out.println(str);
        for(Node child : root.children)
        {

            display(child);
        }
    }

    public static int count(Node root)
    {
        int count=0;
        for(Node child: root.children)
        {
            int countChild=count(child);
            count=count+countChild;
        }
        count=count+1;
        return count;

    }

    public static int max(Node root)
    {
        int  max=Integer.MIN_VALUE;
        for(Node child: root.children)
        {
            int fl=max(child);
            max=Math.max(fl,max);
        }
        max=Math.max(root.data, max);
        return max;
    }

    public static int height(Node root)
    {
        int h=-1;
        for(Node child : root.children)
        {
            int th=height(child);
            h=Math.max(th,h);

        }
        return h+1;
    }
}
