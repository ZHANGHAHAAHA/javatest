package day_01_24;

import java.util.Stack;

public class TestDemo {
        public static int evalRPN(String[] tokens) {
            Stack st = new Stack();
            boolean flag= true;
            int val =0 ;
            for(int i =0;i<tokens.length;i++){
                if("+".equals(tokens[i])){
                    int a = Integer.valueOf(st.pop().toString());
                    int b = Integer.valueOf(st.pop().toString());
                    st.push(b+a);
                }else if("-".equals(tokens[i])){
                    int a = Integer.valueOf(st.pop().toString());
                    int b = Integer.valueOf(st.pop().toString());
                    st.push(b-a);
                }else if("*".equals(tokens[i])){
                    int a = Integer.valueOf(st.pop().toString());
                    int b = Integer.valueOf(st.pop().toString());
                    st.push(b*a);
                }else if("/".equals(tokens[i])){
                    int a = Integer.valueOf(st.pop().toString());
                    int b = Integer.valueOf(st.pop().toString());
                    st.push(b/a);
                }else{
                    st.push(tokens[i]);
                }
            }
            return Integer.valueOf(st.peek().toString());
        }

}
