package _8_LinkedList;

public class RemoveElements {
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

        public void removeLast(){
            // write your code here
            if (size == 0) {
                System.out.println("List is empty");
            }
            else

            if (size == 1) {
                head = tail = null;
                size = 0;
            }
            else
            {

                Node cur=head;
                while(cur.next!=tail)
                {
                    cur=cur.next;

                }

                cur.next=null;
                tail=cur;
                size--;

            }
        }

        public void removeAt(int idx) {
            // write your code here
            if(size==0)
            {
                System.out.println("List is empty");
            }
            else if(idx<0||idx>=size)
            {
                System.out.println("Invalid");
            }
            else  if(idx==0)
            {
                removeFirst();
            }
            else if(idx==size-1)
            {
                removeLast();
            }
            else{
                Node temp=head;
                while(idx-1!=0&&temp.next!=null)
                {
                    temp=temp.next;
                    idx--;
                }
                temp.next=temp.next.next;
                size--;
            }
        }




}


    public static void main(String[] args) {
       LinkedList ll=new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
      //  ll.addLast(10);
        ll.addFirst(77);

        ll.addFirst(70);

        ll.addFirst(87);
        ll.display();
        ll.removeAt(1);
       // ll.removeFirst();
        ll.display();
    }
}
