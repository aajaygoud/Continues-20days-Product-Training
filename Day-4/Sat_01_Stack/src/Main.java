import java.util.Stack;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Hello world!");
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);

            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();



        System.out.println(stack);


    }
}