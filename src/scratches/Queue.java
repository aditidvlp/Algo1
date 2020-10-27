package scratches;

public class Queue {

    int front = 0;
    int rear = 0;
    int size;
    int[] a = new int[5];
    public Queue(int i) {
        this.size = i;
    }

public void enqueue(int r){

    if (rear < size){

            a[rear] = r;
            System.out.println("The queue elements are " +a[rear]);
            rear++;
        }
        else{
            System.out.println("Queue is overflow");
        }

    }
    public int dequeue() {
        if (front == rear) {
            return -1;
        } else {
            return a[front++];
        }
    }

    public static void main(String[] args){

        Queue q = new Queue(5);
        q.enqueue(3);
        q.enqueue(6);
        System.out.println(q.dequeue());
        q.enqueue(7);
        q.enqueue(9);
        q.enqueue(4);
        q.enqueue(5);


    }

}
