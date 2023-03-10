package _8_LinkedList;

public class MidElement {

    private static class Node{
        int data;
        Node next;

       public Node(){
            data=0;
            next=null;
        }

      Node(int val) {    data=val;     this.next = null;    }
    }

    private static class Linkedlist{

            Node head,tail;
            int size;

          public  Linkedlist(){
                this.head=this.tail=null;
                size=0;
            }

          public void addFirst(int val){
                Node node =new Node(val);
                if(this.size==0){
                    this.head=this.tail=node;
                }
                else{
                    node.next=head;
                    this.head=node;

                }
                this.size++;
            }

            public int mid(){
                if(this.size==0)
                {
                    System.out.println("List is empty");
                    return -1;
                }
                else
                {

                    Node slow=this.head,fast=this.head;
                    while(fast.next!=null&&fast.next.next!=null){
                        fast=fast.next.next;
                        slow=slow.next;
                    }
                    return slow.data;
                }

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

        Linkedlist ll=new Linkedlist();
//       10
//10
//30
//20
//20
//40
//20
//40
        ll.addFirst(10);

        ll.addFirst(20);

        ll.addFirst(30);

        ll.addFirst(40);

        ll.addFirst(50);

        ll.addFirst(60);

        ll.addFirst(70);
        ll.display();
        System.out.println(ll.mid());

    }

}

