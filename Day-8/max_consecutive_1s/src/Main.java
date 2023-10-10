public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a[]={1,1,0,1,1,1,0,1};
        int count=0;
        int max1=-999999;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count++;
            }
            else{
                count=0;
            }
            max1=Math.max(max1,count);
        }
        System.out.println(max1);
    }
}