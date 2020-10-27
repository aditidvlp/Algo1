package scratches;

public class CircularQueue {

    int rear = 0;
    int front = 0;
    int size;
    int c;
    int b;
    int a[] = new int[4];

    public CircularQueue(int i){
        this.size = i;

    }
    public void enqueue(int r){

       if ((rear % size < front) || (rear < size)){


            c = rear % size;
            a[c] = r;
            System.out.println("The elements are " +a[c]);
        }
        else{
            System.out.println(" no more space left in queue");
        }
    }
    public int dequeue() {
        if (rear == front) {
            return -1;
        } else {

            int dequeuedElement = a[front];
            a[front] = -1;

            return dequeuedElement;
          //  System.out.println("The dequeue item is " + b);
        }

    }
    public static void main(String[] args){

        CircularQueue queue = new CircularQueue(4);
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.enqueue(1);
        queue.dequeue();
        queue.enqueue(10);

    }
}
