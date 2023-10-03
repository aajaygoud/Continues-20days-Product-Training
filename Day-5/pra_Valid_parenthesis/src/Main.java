public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s="((";
        boolean ans=checkValid(s);
        System.out.println(ans);
    }
    public static boolean checkValid(String s){
        char[] arr=new char[s.length()];
        int k=0;
        if(s.length()%2!=0){
            //System.out.println("Invalid Match");
            return false;
        }
        else {
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    arr[k++] = c;
                } else if ((k > 0 && c == ')' && arr[k - 1] == '(') || (k > 0 && c == ']' && arr[k - 1] == '[') || (k > 0 && c == '}' && arr[k - 1] == '{')) {
                    k--;
                } else {
//                    System.out.println("Invalid");
//                    break;
                    return false;
                }
            }
            if (k == 0) {
                //System.out.println("Valid");
                return true;
            } else {
                return false;
            }


        }

    }
}