package _8_LinkedList;

public class AddLast {

    private static class Node {
        int data;
        Node next;

        Node() {
            data = 0;
            next = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private static class LinkedList {
        private Node head, tail;
        private int size;

        LinkedList() {
            head = tail = null;
            size = 0;
        }

//        public void addFirst(int val) {
//         Node node = new Node(val);
//            if(this.size == 0){
//                this.head = this.tail = node;
//            }else{
//                node.next = this.head;
//                this.head = node;
//            }
//            this.size++;
//        }
//
        public void addLast(int val)
        {
            Node temp = new Node();
            temp.data=val;
            temp.next=null;

            if(size ==0)
            {
                head=tail=temp;
                //size++;
            }

            else {

                tail.next=temp;
                tail=temp;
                }
            size++;
        }


        public int size(){
            return this.size;
        }

        public void display(){
            if(this.size == 0)
                return;

            Node curr = this.head;

            while(curr != null){
                System.out.print(curr.data+"->");
                curr = curr.next;

            }


            System.out.println();
        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addLast(10);

        ll.addLast(20);

        ll.addLast(30);

        ll.addLast(40);

        System.out.println(ll.size());
        ll.display();
    }
}
