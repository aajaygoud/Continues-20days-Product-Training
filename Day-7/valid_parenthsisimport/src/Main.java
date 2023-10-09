import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        boolean ans=valid("(){}(({{}})");
        System.out.println(ans);
    }
    public static boolean valid(String s){
        Stack<Integer> st=new Stack<>();
        for(char c:s.toCharArray()){
           if(c=='(' || c=='{' || c=='['){
               st.push((int)c);
           }
           else if(!st.isEmpty() && c==')' && st.peek()=='('){
               st.pop();
           }
           else if(!st.isEmpty() && c=='}' && st.peek()=='{'){
               st.pop();
           }
           else if(!st.isEmpty() && c==']' && st.peek()=='['){
               st.pop();
           }
           else{
               return false;
           }
        }
        return st.isEmpty();

    }
}