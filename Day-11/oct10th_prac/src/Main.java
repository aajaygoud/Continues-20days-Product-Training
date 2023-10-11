import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       fun(1);
        //System.out.println(Arrays.toString())
    }
    public static void fun(int n){
        if(n>5){
            return ;
        }
        else{
            fun(n+1);
            System.out.println(n);
        }
    }
}