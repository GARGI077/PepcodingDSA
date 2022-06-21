package LinkedList;

public class AddAtIndex {
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
        public void addLast(int val) {
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

        public void addAt(int idx,int val)
        {
            if(idx<0||idx>size)
            {
                System.out.println("Invalid arguments");
            }

            else if (idx==0)
            {
                addFirst(val);
            }
            else if(idx==size)
            {
                addLast(val);
            }
            else
            {
                Node node = new Node();
                node.data=val;
                Node temp=head;

                for(int i=0;i<idx-1;i++)
                {
                    temp=temp.next;
                }
                node.next=temp.next;
                temp.next=node;

                size++;
            }
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
    }

    public static void main(String[] args) {

        LinkedList ll=new LinkedList();
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addLast(10);
        ll.addAt(1,77);

        ll.addAt(3,77);
        System.out.println(ll.size());
        ll.display();
    }
}
