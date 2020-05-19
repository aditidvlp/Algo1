package scratches;

public class Stack{

    int stack[] = new int[8];
    int top = 0;
    public void push(int element){

        stack[top] = element;
        top = top + 1;
    }

   public void pop(int element){

        top = top - 1;
      int get = stack[top];
      stack[top] =  -1;


      System.out.println(get);

}

    public void show(){

        for (int n : stack) {

            System.out.println(n + " ");
        }
    }
    public static void main(String[] args){


        // Create the object of Stack class
        Stack numbers = new Stack();


        // Push the elements into the Stack
        numbers.push(3);
        numbers.push(5);
        numbers.push(7);
        numbers.push(9);
        numbers.push(2);

       //Show the numbers of Stack after pushing elements
        numbers.show();

        //Pop up the elements from the Stack

        numbers.pop(2);

        //Show the number of Stack after popping elements

        numbers.show();





    }


}