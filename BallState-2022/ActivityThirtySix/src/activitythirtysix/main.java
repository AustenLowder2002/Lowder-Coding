package activitythirtysix;

public class main {
    public static void main(String[] args){
        BinarySearchTree myobj = new BinarySearchTree();

        myobj.addNode('a');
        myobj.addNode('b');
        myobj.addNode('c');
        myobj.addNode('d');
        myobj.addNode('e');
        myobj.addNode('f');
        myobj.addNode('g');
        System.out.println("Preorder traversal: ");
        myobj.preOrderTraverse(myobj.getRoot());
        System.out.println();
        System.out.println("--------------------");

        System.out.println("Inorder traversal: ");
        myobj.inOrderTraverse(myobj.getRoot());
        System.out.println();
        System.out.println("--------------------");

        System.out.println("Postorder traversal: ");
        myobj.postOrderTraverse(myobj.getRoot());
        System.out.println();
        System.out.println("--------------------");
    }
}
