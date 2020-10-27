package scratches;

public class BinarySearchTree {


    TreeNode root;
   public void addNode(int key, String name) {

       TreeNode newNode = new TreeNode(key, name);

       if (root == null) {

           root = newNode;
       } else {

           TreeNode focusNode = root;

           TreeNode parent;

           while (true) {

               parent = focusNode;

               if (key < focusNode.key) {

                   focusNode = focusNode.leftChild;
                   if (focusNode == null) {

                       parent.leftChild = newNode;
                       return;

                   }
               } else {

                   focusNode = focusNode.rightChild;

                   if (focusNode == null) {

                       parent.rightChild = newNode;
                       return;
                   }
               }
           }

       }
   }
    //to create node class
    //left node and right node


    public  void inOrderTraverseTree (TreeNode focusNode){

       if ( focusNode != null)
            {

                inOrderTraverseTree(focusNode.leftChild);

                System.out.println(focusNode);

                inOrderTraverseTree(focusNode.rightChild);
            }
    }

    public  void preOrderTraverseTree (TreeNode focusNode){

        if ( focusNode != null)
        {

            System.out.println(focusNode);

            preOrderTraverseTree(focusNode.leftChild);

            preOrderTraverseTree(focusNode.rightChild);
        }
    }

    public TreeNode findNode(int key) {

        TreeNode focusNode = root;

        while (focusNode.key != key) {

            if (key < focusNode.key) {

                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null)
                return null;
        }
        return focusNode;
    }

    public static void main(String[] args)

    {
        BinarySearchTree bst = new BinarySearchTree();


        bst.addNode(20,"A");
        bst.addNode(60,"Ba");
        bst.addNode(100, "Cb");
        bst.addNode(40, "Dc");
        bst.addNode(25,"Ed");

        bst.preOrderTraverseTree(bst.root);

        System.out.println("Search for 30");

        System.out.println(bst.findNode(60));

    }
}

