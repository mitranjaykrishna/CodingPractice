package StackQueue;

public class StackClass {

    static class Node{
        int val;
        Node next;
        public Node(int val)
        {
            this.val=val;
            this.next=null;
        }
    }

    static class StackD{
        public static Node head;
        public static boolean isEmpty()
        {
            return head==null;
        }

        public static void push(int data)
        {
            Node newNode=new Node(data);

            if(isEmpty())
            {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        public static int pop()
        {
            if(head==null)
            {
                return -1;
            }
            int val= head.val;
            head=head.next;
            return val;
        }
        public static int peak()
        {
            if(head==null)
            {
                return -1;
            }
            return head.val;

        }
    }
    public static void main(String[] args) {

        StackD s=new StackD();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        System.out.println( s.peak());

    }
}
