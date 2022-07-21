package LinkedList;

public class DoublyLL {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLL()
    {
        this.size=0;
    }

    //Insert At First
    public void insertFirst(int value)
    {
        Node node= new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null)
            head.prev=node;
        head=node;
        if(tail==null)
            tail=head;
        size++;
    }

    //Insert At Last
    public void insertLast(int value)
    {
        if(tail==null)
        {
            insertFirst(value);
            return;
        }
        Node node=new Node(value);
        node.next=null;
        node.prev=tail;
        tail.next=node;
        tail=node;
        size++;
    }

    //Insert at Given index
    public void insertIndex(int value,int index)
    {
        if (index==0)
        {
            insertFirst(value);
            return;
        }
        if(size-1==index)
        {
            insertLast(value);
            return;
        }
        Node temp=head;
        for (int i=1;i<index;i++)
        {

        }
        Node node=new Node(value);

    }


    //Node
    private static class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value)
        {
            this.value=value;
        }

        public Node(int value,Node next,Node prev)
        {
            this.value=value;
            this.next=next;
            this.prev=prev;
        }

    }//Node End
}
