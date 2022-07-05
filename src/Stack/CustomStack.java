package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CustomStack {
    int[] data;
    int tos;

    public CustomStack(int cap) {
        data = new int[cap];
        tos = -1;
    }

    int size() {
        // write ur code here
        return tos++;
    }

    void display() {
        // write ur code here
        for (int idx=tos;idx>=0;idx--)
        {
            System.out.print(data[idx]+"");
        }
        System.out.println();
    }

    void push(int val) {

        if(tos==data.length - 1)
        {
            System.out.println("Stack overflow");
        }
        else{

            tos++;
            data[tos]=val;
        }

    }

    int pop() {
        // write ur code here
        if(size()==0)
        {
            System.out.println("Stack Underflow");
        }

            int v1=data[tos];
            tos--;

        return v1;
    }

    int top() {
        // write ur code here
        if(size()==0)
        {
            System.out.println("Stack Underflow ");
            return -1;

        }

        int v1=data[tos];
        return v1;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        CustomStack st = new CustomStack(n);

        String str = br.readLine();
        while(str.equals("quit") == false){
            if(str.startsWith("push")){
                int val = Integer.parseInt(str.split(" ")[1]);
                st.push(val);
            } else if(str.startsWith("pop")){
                int val = st.pop();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("top")){
                int val = st.top();
                if(val != -1){
                    System.out.println(val);
                }
            } else if(str.startsWith("size")){
                System.out.println(st.size());
            } else if(str.startsWith("display")){
                st.display();
            }
            str = br.readLine();
        }
    }
}
