package _10_Stack;

import java.util.Stack;

public class StackIntro {
    public static void main(String[] args) {

        Stack<Integer> st=new Stack<>();
        System.out.println(st+"-> "+st.size());
        st.push(10);
        System.out.println("TME "+st.peek());
        st.push(20);

        System.out.println("TME "+st.peek());
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
      st.pop();

        st.push(80);
        st.push(90);

        int len=st.size();
        Object[] arr=st.toArray();
        for(int ele:st)
        {
            System.out.print(ele+" ->");
            //arr=ele;
        }

       // System.out.println(arr);
    }
}
