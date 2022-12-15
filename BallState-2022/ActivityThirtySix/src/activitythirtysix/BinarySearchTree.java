package activitythirtysix;

public class BinarySearchTree
{
    private Node root;

    public void addNode(char key)
    {
        Node newNode = new Node(key);
        if (root == null)
        {
            root = newNode;
        }
        else
        {
            Node currentNode = root;
            Node parent;
            while (true)
            {

                parent = currentNode;

                if (key < currentNode.getKey())
                {
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null)

                    {
                        parent.setLeftChild(newNode);
                        return; // done
                    }
                }
                else // the new node will go on the right side
                {
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null)
                    {
                        parent.setRightChild(newNode);
                        return;
                    }
                }
            }
        }
    }
    // inorder traversal: all nodes are visited in ascending order
// recursion is used to visit a node and then its child nodes
    public void inOrderTraverse(Node currentNode)
    {
        if (currentNode != null)
        {
            inOrderTraverse(currentNode.getLeftChild());
            System.out.print(currentNode.getKey() + " ");
            inOrderTraverse(currentNode.getRightChild());
        }
    }
    public void preOrderTraverse(Node currentNode)
    {
        if (currentNode != null)
        {
            System.out.print(currentNode.getKey() + " ");
            preOrderTraverse(currentNode.getLeftChild());
            preOrderTraverse(currentNode.getRightChild());
        }
    }
    public void postOrderTraverse(Node currentNode)
    {
        if (currentNode != null)
        {
            postOrderTraverse(currentNode.getLeftChild());
            postOrderTraverse(currentNode.getRightChild());
            System.out.print(currentNode.getKey() + " ");
        }
    }
    public String findNode(int key)
    {
        Node currentNode = root;
        while (currentNode.getKey() != key)
        {
            if (key < currentNode.getKey())
            {
                currentNode = currentNode.getLeftChild();
            }
else
            {
                currentNode = currentNode.getRightChild();
            }
            if (currentNode == null) // if not found
            {
                return String.format("%d not found", key);
            }
        }
        return String.format("%d was found", currentNode.getKey());
    }
    public Node getRoot()
    {
        return root;
    }
    public String removeNode(int key)
    {
        Node currentNode = root; // start at top of tree
        Node parent = root;
        boolean isLeftChild = true;
        while (currentNode.getKey() != key)
        {
            parent = currentNode;  // set parent to the current node
            if (key < currentNode.getKey())
            {
                isLeftChild = true; // it is a leftChild
                currentNode = currentNode.getLeftChild();
            }
else // key is greater than current node
            {
                isLeftChild = false; // it is a right child
                currentNode = currentNode.getRightChild();
            }
            if (currentNode == null) // if node wasn't found
            {
                return String.format("%d not found", key);
            }
        }
// if node has no children, remove it
        if (currentNode .getLeftChild() == null && currentNode.getRightChild()
                == null)
        {
            if (currentNode == root) // if node is root, remove it
                root = null;
            else if (isLeftChild) // if it is left child of the parent
            {
                parent.setLeftChild(null); // remove it from parent
            }
            else // if it is right child of parent
            {
                parent.setRightChild(null); // remove it from parent
            }
        }
        else if (currentNode.getRightChild() == null) // if node has no right

        {
            if (currentNode == root) // if node is root
            {
                root = currentNode.getLeftChild();
            } else if (isLeftChild) {
                parent.setLeftChild(currentNode.getLeftChild());
            } else {
                parent.setRightChild(currentNode.getLeftChild());
            }
        }else if(currentNode.getLeftChild() == null)
        {
            if (currentNode == root) // if node is root
            {
                root = currentNode.getRightChild();
            }
            else if (isLeftChild)
            {
                parent.setLeftChild(currentNode.getRightChild());
            }
else
            {
                parent.setRightChild(currentNode.getRightChild());
            }
        }
else
        {
            Node replacement = getReplacementNode(currentNode);
            if (currentNode == root)
            {
                root = replacement;
            }
else if (isLeftChild)
            {
                parent.setLeftChild(replacement);
            }
else
            {
                parent.setRightChild(replacement);
            }
            replacement.setLeftChild(currentNode.getLeftChild());
        }
        return String.format("%d was removed", key);
    }
    public Node getReplacementNode(Node replacedNode)
    {
        Node replacementParent = replacedNode;
        Node replacement = replacedNode;
        Node currentNode = replacedNode.getRightChild();
        while (currentNode != null) // while there are no more left children
        {
            replacementParent = replacement;
            replacement = currentNode;
            currentNode = currentNode.getLeftChild();
        }

        if (replacement != replacedNode.getRightChild())
        {
            replacementParent.setLeftChild(replacement.getRightChild());
            replacement.setRightChild(replacedNode.getRightChild());
        }
        return replacement;
    }
}
