package scratches;

public class Matrix {


    // initialise simple array
    static int[][] second = {{2, 1}, {5, 7}};

    //initialise multi-dimensional array using Java Loop
    static int[][] board = new int[3][3];


    public static void main(String args[]) {
//        System.out.println(second[0][0]);
//        System.out.println(second[0][1]);
//        System.out.println(second[1][0]);
//        System.out.println(second[1][1]);


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = i + j;
            }

        }

        for (int[] a : board) {
            for (int i : a) {
                System.out.println(i + "\t");
            }
            System.out.println("\n");

        }
    }
}

