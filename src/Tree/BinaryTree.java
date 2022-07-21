package Tree;

import java.util.*;

public class BinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    static class BT{
        static int idx=-1;
        public static Node buildTree(int node[])
        {
            idx++;

            if(node[idx]==-1)
                return null;
            Node newNode=new Node(node[idx]);
            newNode.left=buildTree(node);
            newNode.right=buildTree(node);
            return newNode;

        }

    }
    public static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root)
    {
        if(root==null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
    public static void postOrder(Node root){
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
//level Order
    public static void levelOrder(Node root)
    {
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            Node currentNode=q.remove();
            if(currentNode==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }

            }
            else
            {
                System.out.print(currentNode.data);
                if(currentNode.left!=null)
                {
                    q.add(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    q.add(currentNode.right);
                }

            }
        }
    }
    //Count number of Nodes
    public static int countNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }


        int left=countNodes(root.left);
        int right=countNodes(root.right);
        return left+right+1;
    }

    //Sum of Nodes
    public static int sumOfNodes(Node root)
    {
        if(root==null)
            return 0;
        int left=sumOfNodes(root.left);
        int right=sumOfNodes(root.right);
        return left+right+root.data;
    }

    // height of a tree

    public static int height(Node root)
    {
        if(root==null)
            return 0;
        int leftH=height(root.left);
        int rightH=height(root.right);
        return Math.max(leftH,rightH)+1;
    }
    //Diameter Approach 1 O(n^2)
    public static int diameter(Node root)
    {
        if(root==null)
            return 0;
        int leftDiameter=diameter(root.left);
        int rightDiameter=diameter(root.right);
        int rootDiameter=height(root.left)+height(root.right)+1;

        return Math.max(leftDiameter,Math.max(rightDiameter,rootDiameter));
    }

    //Diameter Approach 1 O(n)
    static class TreeInfo
    {
        int ht;
        int dia;

        public  TreeInfo(int ht,int dia)
        {
            this.ht=ht;
            this.dia=dia;
        }
    }
    public static TreeInfo diameter2(Node root)
    {
        //base case
        if(root==null)
        {
            return new TreeInfo(0,0);
        }
        TreeInfo left=diameter2(root.left);
        TreeInfo right=diameter2(root.right);

        int myheight=Math.max(left.ht,right.ht)+1;

        int leftDiameter=left.dia;
        int rightDiameter=right.dia;
        int rootDiameter=left.ht+right.ht+1;

        int myDiameter=Math.max(Math.max(leftDiameter,rightDiameter),rootDiameter);

        TreeInfo info=new TreeInfo(myheight,myDiameter);
        return info;
    }

    public static void main(String[] args) {
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BT tree= new BT();
        Node root=tree.buildTree(nodes);
//        System.out.println(root.data);
        System.out.print("PreOrder print-:");
        preOrder(root);
        System.out.print("\nInOrder Traversal-:");
        inOrder(root);
        System.out.print("\nPostOrder Traversal-:");
        postOrder(root);
        System.out.print("\nLevelOrder Traversal-:");
        levelOrder(root);
        System.out.print("Number Of Nodes-:");
        System.out.println(countNodes(root));
        System.out.print("Sum of Nodes Data-:");
        System.out.println(sumOfNodes(root));
        System.out.print("Height of a tree-:");
        System.out.println(height(root));
        System.out.print("Longest Diameter Using O(n^2)-:");
        System.out.println(diameter(root));
        System.out.print("Longest Diameter Using O(n)-:");
        System.out.println(diameter2(root).dia);



    }
}
