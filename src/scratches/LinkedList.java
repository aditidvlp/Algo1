package scratches;

public class LinkedList {

       Node head;

       public boolean isEmpty() {
           return (head == null);
       }

       public void insert(int data) {

           Node newNode = new Node();
           newNode.next = head;
           newNode.data = data;
           head = newNode;
       }

       public void printLinkedList() {

           Node current = head;
           while (current != null) {
               current.displayData();
               current = current.next;
           }
           System.out.println();
       }

       public static void main(String[] args) {
           LinkedList myLinkedList = new LinkedList();
           myLinkedList.insert(2);
           myLinkedList.insert(4);
           myLinkedList.insert(6);

       }


       class Node {
           Node next;
           int data;

           public void displayData() {
               System.out.println("{ " + data + " } ");
           }
       }
   }