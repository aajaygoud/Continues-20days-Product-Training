public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n=200;
        int divisor=2;
        int ans=rec(n,divisor,0);
        System.out.println(ans);
    }
    public static int rec(int n,int divisor,int count){
        if(n<divisor){
            return count;
        }
        else
            return rec(n-divisor,divisor,count+=1);
    }
}