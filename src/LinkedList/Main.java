package LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLL list=new SinglyLL();
        list.insertFirst(13);
        list.insertFirst(14);
        list.insertFirst(15);
        list.insertFirst(16);
        list.insertFirst(17);
        list.insertFirst(18);
        list.insertLast(19);
        list.display();
        System.out.println("Del "+list.deleteFirst());
        list.display();

        System.out.println(list.find(16));


    }
}
