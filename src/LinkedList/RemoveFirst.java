package LinkedList;

public class RemoveFirst {
    private static class Node{
        int data;
        Node next;
        Node(){
            data = 0;
            next = null;
        }
        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node(int data,Node next){
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

        public void addFirst(int val) {
            Node node = new Node(val);
            if (this.size == 0) {
                this.head = this.tail = node;
            } else {
                node.next = this.head;
                this.head = node;
            }
            this.size++;
        }

        public int size() {
            return this.size;
        }

        public void display() {
            if (this.size == 0)
                return;

            Node curr = this.head;

            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }

            System.out.println();
        }

        public void removeFirst(){
            if(size()==0){

                head=tail=null;
                size=0;
            }
            else{
                head=head.next;
            }
            size--;

        }
    }


    public static void main(String[] args) {
       LinkedList ll=new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
      //  ll.addLast(10);
        ll.addFirst(77);
        ll.display();
        ll.removeFirst();

    }
}
