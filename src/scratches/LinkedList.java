package scratches;

public class LinkedList {
    LinkedListNode head;
    LinkedListNode current;

       public void insert(int data) {

           LinkedListNode newNode = new LinkedListNode();
           newNode.data = data;
           newNode.next = null;

           if (head == null) {

               head = newNode;
           } else {
               current = head;

               while (current.next != null) {
                   current = current.next;
               }
               current.next = newNode;

           }
       }

       public void show() {
           LinkedListNode newNode = head;
           while (current.next != null) {
               System.out.println("The element is " + newNode.data);
               newNode = newNode.next;

           }
         //  System.out.println(newNode.data);

       }

   }