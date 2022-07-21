package LinkedList;

public class SinglyLL {
    private Node head;
    private Node tail;
    private int size;
    public SinglyLL()
    {
        this.size=0;
    }

    //Insert At First Place
    public  void insertFirst(int value)
    {
        Node node= new Node(value);
        node.next=head;
        head=node;

        if(tail==null)
        {
            tail=head;
        }

        size+=1;
    }

    //Insert At Last Place
    public void insertLast(int value)
    {
        if(tail==null)
        {
            insertFirst(value);
            return;
        }
        Node node= new Node(value);
        tail.next=node;
        tail=node;
        size+=1;
    }

    //Insert At Given Index
    public void insertIndex(int value,int index)
    {
        if(index==0)
        {
            insertFirst(value);
            return;
        }
        if(size==index)
        {
            insertLast(value);
            return;
        }

        Node temp=head;
        for (int i = 1; i < index ; i++) {
            temp=temp.next;
        }
        Node node= new Node(value, temp.next);
        temp.next=node;
        size++;

    }

    //Delete At First
    public int deleteFirst()
    {
        int value= head.value;
        head=head.next;
        if(head==null)
            tail=null;
        size--;
        return value;
    }

    //Deletion At Last
    public int deleteLast()
    {
        if(size<=1)
        {
            return deleteFirst();
        }
        int value= tail.value;
        Node temp=get(size-2);
        tail=temp;
        tail.next=null;
        return value;
    }

    //Delete At Specific Position
    public int deleteAtPosition(int index)
    {
        if(index==0)
        {
            return deleteFirst();
        }
        if((size-1)==index)
        {
            return deleteLast();
        }
        Node temp=get(index-1);
        int value=temp.next.value;
        temp.next=temp.next.next;
        size--;
        return size;
    }

    // Find the node of the given value
    public Node find(int value)
    {
        Node temp=head;
        while (temp!=null)
        {
            if(temp.value==value)
                return temp;
            temp=temp.next;
        }
        return null;
    }

    //Traverse Till tail-1
    public Node get(int index)
    {
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    //Display
    public void display()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }



    //Node
    private static class Node{
        private int value;
        private Node next;

        public Node(int value)
        {
            this.value=value;
        }
        public Node(int value,Node next)
        {
            this.value=value;
            this.next=next;
        }
    }
}
