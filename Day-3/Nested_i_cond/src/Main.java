public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        for(int i=0;i<5;i++)
        {
            System.out.print(i+"->");
            for(int j=0;j<i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}