import static java.lang.System.out;

public class IntBSTRunner {
    public static void main(String[] args) {
        IntBST bst = new IntBST();
        String input = "90 100 80 98 85 70 120";
        for(String i : input.split(" ")) {
            bst.add(Integer.parseInt(i));
        }
        out.println("IN ORDER");
        bst.inOrder();
        out.println("\nPRE ORDER");
        bst.preOrder();
        out.println("\nPOST ORDER");
        bst.postOrder();
        out.println("\nREVERSE ORDER");
        bst.revOrder();
        out.println("\nTree height is " + bst.getHeight());
        out.println("Tree width is " + bst.getWidth());
        out.println("Number of leaves is " + bst.getNumLeaves());
        out.println("Number of nodes is " + bst.getNumNodes());
        out.println("Number of levels is " + bst.getNumLevels());
        out.println("Tree as a string " + bst.toString());
        out.println("Tree is " + (bst.isFull() ? "full." : "not Full"));
        out.println("Contains method not impl");
        out.println("Contains method not impl");
        //out.println("The smallest tree node" + bst.getSmallest());
        //out.println("The largest tree node " + bst.getLargest());
        //out.println("Tree before removing any nodes - using level order traversal");
        //out.println(bst.levelOrder());

    }
}
