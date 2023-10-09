public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr={9,6,8,4};
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    c++;
                }
            }
        }
        System.out.println("INversions are: "+c);
    }
}