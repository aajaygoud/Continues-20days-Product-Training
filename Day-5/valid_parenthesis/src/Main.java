import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "[]";
       // validPare(s);
    }

    public static void validPare(String s) {
        if (s.length() % 2 != 0) {
            System.out.println("Invalid parenthesis");
        } else {
            char[] ch = s.toCharArray();
            int mid = (ch.length) / 2;
            int c=mid;
            for (int i = mid-1; i >=0; i--) {
                if(mid>ch.length-1){
                    break;
                }
                else if(ch[i] == '(' && ch[mid] == ')' || ch[i] == '{' && ch[mid] == '}' || ch[i] == '[' && ch[mid] == ']')
                mid += 1;

            }

            //if (count == (ch.length) / 2)
            if(mid-1==s.length()-1)
                System.out.println("Valid parenthesis");
            else {
                System.out.println("Invalid parenthesis");
            }
        }

    }
    

}