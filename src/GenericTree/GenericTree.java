package GenericTree;

import java.util.*;

public class GenericTree {

    private static class Node{
        int data;
        ArrayList<Node> children;
        Node(int val){
            data = val;
            children = new ArrayList<>();
        }

        public Node() {

        }
    }
    public static void display(Node node) {
        String str = node.data + " -> ";
        for (Node child: node.children) {
            str += child.data + ", ";
        }
        str += ".";
        System.out.println(str);

        for (Node child: node.children) {
            display(child);
        }
    }
    public static Node constructGT(Integer arr[]){

        Stack<Node> st=new Stack<>();
        Node root=new Node(arr[0]);
        st.push(root);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node t = new Node();
                t.data = arr[i];

                if (st.size() > 0) {
                    st.peek().children.add(t);
                } else {
                    root = t;
                }

                st.push(t);
            }
        }

        return root;
    }




    public static void main(String args[]){
        Integer arr[] = {10,20,null,30,50,null,60,null,null,40,null,null};
        Node root = constructGT(arr);
    }
}
