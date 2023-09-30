public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n=10;
        int k=3;
        int ans=setbit(n,k);
        System.out.println(ans);
    }
    public static int setbit(int n,int k){
        return (n&(1<<(k-1)));
    }
}