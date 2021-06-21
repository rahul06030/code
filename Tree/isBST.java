class Tree {
    static class Node 
    { 
        int val; 
        Node left, right; 
    }; 
    

    public static Node prev=null;
    public static boolean isBst(Node root){
            if(root!= null){
                if(!isBst(root.left)) return false;
                if(prev!=null && prev.val>=root.val) return false;
                prev= root;
                return isBst(root.right);
            }
            return true;
        }
 

    static boolean isBST(Node root, Node l, Node r) 
    { 
        if (root == null) 
            return true; 
        if (l != null && root.val <= l.val) 
            return false; 
        if (r != null && root.val >= r.val) 
            return false; 
        return isBST(root.left, l, root) && 
            isBST(root.right, root, r); 
    } 

    static Node newNode(int val) 
    { 
        Node node = new Node(); 
        node.val = val; 
        node.left = node.right = null; 
        return (node); 
    } 

    // Driver code
    public static void main(String args[])
    { 
        Node root = newNode(3); 
        root.left = newNode(2); 
        root.right = newNode(5); 
        root.left.left = newNode(1); 
        root.left.right = newNode(4); 

        if (isBST(root,null,null)) 
            System.out.print("Is BST"); 
        else
            System.out.print("Not a BST"); 
    }
} 
