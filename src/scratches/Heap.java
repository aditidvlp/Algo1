package scratches;

public class MaxHeap {


    int size;
    int maxsize;
    int[] Heap;



    public  MaxHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size=0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MAX_VALUE;
    }
    private int parent(int i )
        {
            return  i/2;
        }
    private int leftChild(int i){

       return 2 * i;
        }

   private int rightChild(int i) {

       return 2 * i + 1;
   }
       private boolean isLeaf(int i)
        {
            if (i >= (size / 2) && i <= size) {
            return true;
        }
            return false;
        }

    public static void main(String[] args){

        MaxHeap  maxheap = new MaxHeap(7);
        maxheap.maxHeapify(17);
        maxheap.maxHeapify(13);
        maxheap.maxHeapify(10);

    }
}


