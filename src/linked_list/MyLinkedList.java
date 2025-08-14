package linked_list;


import loggerUtils.LogUtil;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLinkedList<T> {
    private static final Logger logger = LogUtil.getLogger(MyLinkedList.class);

    Node<T> head;
    int size = 0;
    
    MyLinkedList() {
        this.head=null;
    }
    
    public void insert(T data, int position) {
        if (position <= 0) {
            logger.log(Level.WARNING, "Invalid position: must be >= 1");
            return;
        }
        if (position == 1)
        {
            insertHead(data);
        }
        else if (position == size+1) {
            insertTail(data);
        } else if (position > size+1) {
            logger.log(Level.WARNING, "Position to place node is beyond LinkedList size");
        }
        else {
            Node<T> newNode = new Node<>(data);
            Node<T> temp = head;
            int i=1;
            while (i<position-1){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
            logger.log(Level.INFO, "Inserted at position: " + position);
        }
    }

    private void insertHead(T data) {
        Node<T> newNode = new Node<>(data);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        size++;
        logger.log(Level.INFO, "Insertion at head is done");
    }

    private void insertTail(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        }
        else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
        logger.log(Level.INFO, "Insertion at tail is done");
    }

    public void printList(){
        Node<T> temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }

    public int getSize() {
        return size;
    }

    public void deleteHead() {
        if (head == null){
            logger.log(Level.WARNING, "No Node exist!");
            return;
        }
        else if (head.next == null){
            head = null;
            logger.log(Level.INFO, "Head is deleted, No node exist");
        }
        else {
            head = head.next;
            T data = head.next.data;
            logger.log(Level.INFO, "Head is deleted, new head is: " + data);
        }
        size--;
    }

    private void deleteTail() {
        if (head == null){
            logger.log(Level.WARNING, "No Node exist!");
            return;
        }
        else if (head.next == null){
            head = null;
            logger.log(Level.INFO, "Tail is deleted, No node exist");
        }
        else {
            Node<T> temp=head;
            while (temp.next.next != null){
                temp = temp.next;
            }
            T data = temp.data;
            temp.next = null;
            logger.log(Level.INFO, "Tail is deleted, new Tail is: " + data);
        }
        size--;
    }

    public void delete(int position) {
        if (position <= 0){
            logger.log(Level.WARNING, "Invalid position: must be >= 1");
        } else if (position == 1) {
            deleteHead();
        } else if (position == size) {
            deleteTail();
        } else if (position > size) {
            logger.log(Level.WARNING, "Position to delete node is beyond LinkedList size");
        }
        else {
            int i=1;
            Node<T> temp = head;
            Node<T> toDeleteNodeNextRef;
            while (i<position-1){
                temp = temp.next;
                i++;
            }
            toDeleteNodeNextRef = temp.next;
            temp.next = temp.next.next;
            toDeleteNodeNextRef.next = null;
            size--;
            logger.log(Level.INFO, "Deleted at position: " + position);
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Character> list = new MyLinkedList<>();
        list.insert('B', 1);
        list.insert('D', 2);
        list.insert('C', 2);
        list.insert('A',1);
        list.insert('E',5);
        list.insert('F',7);
        list.insert('F',6);
        System.out.println("Size of list is: " + list.getSize());
        list.printList();
        list.delete(1);
        list.printList();
        list.delete(list.getSize());
        list.printList();
        list.delete(3);
        list.printList();
        System.out.println("Size of list is: " + list.getSize());
        list.delete(4);

    }
}
