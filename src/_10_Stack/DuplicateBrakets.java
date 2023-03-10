package _10_Stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrakets {

    public static boolean checkDuplicate(String exp )
    {
        Stack<Character> st=new Stack<>();

        for(int i=0;i<exp.length();i++) {
            char ch=exp.charAt(i);

            if(ch==')') {
                if(st.peek()=='(')
                {
                    return true;// Found an extra element
                }
                else
                {
                    while(st.peek()!='(')
                    {
                        st.pop();
                    }
                    st.pop();
                }

            }
            else if(ch==' '){
                continue;
        }
            else{
                st.push(ch);
            }
        }
        return false;
    }
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++) {

            char ch=s.charAt(i);

            if(ch==')'&&!st.isEmpty()&&st.peek()=='(' ) {
                st.pop();// Found an extra element
            }
            else if(ch=='}'&&!st.isEmpty()&&st.peek()=='{' ){
                st.pop();
            }
            else if(ch==']'&&!st.isEmpty()&&st.peek()=='['){
                st.pop();
            }

            else{

                st.push(ch);
            }


        }

        return st.isEmpty();

    }
    public static int longestValidParentheses(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        String str=in.nextLine();
        System.out.println(longestValidParentheses(str));
       // System.out.println(isValid(str));
        //System.out.println(checkDuplicate(str));

    }
}
