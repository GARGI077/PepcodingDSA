package Queue;

import java.util.Scanner;

public class CustomQueue {
    int[] data;
    int front;
    int size;

    public CustomQueue(int cap){
        data=new int[cap];
        front=0;
        size=0;
    }


    int size() {
        return size;
    }

    void display() {
        int n = data.length;
        for(int idx = 0 ; idx < this.size ; idx++){
            System.out.print(data[(this.front+idx) % n]+" ");
        }
        System.out.println();
    }

    void add(int val) {
        if(this.size == this.data.length){
            System.out.println("Queue overflow");
            return;
        }

        int idx = (this.front + this.size) % this.data.length;
        this.data[idx] = val;
        this.size++;
    }
    int remove() {
        if(this.size == 0){
            System.out.println("Queue underflow");
            return -1;
        }
        int val = data[front];
        front = (front+1)%this.data.length;
        size--;
        return val;
    }

    int peek() {
        if(this.size == 0){
            System.out.println("Queue underflow");
            return -1;
        }
        int val = data[front];
        return val;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n=in.nextInt();

        CustomQueue queue =new CustomQueue(n);
    }

}
