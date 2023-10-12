public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr=new int[1000];
        String s="BFFFBFBFFB";
        int man=0;
        int count=1;
        arr[0]=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='B'){
                if(man>0){
                    man--;
                    if(arr[man]==0){
                        count++;
                        arr[man]=1;
                    }
                }

            }
            else{
                man+=2;
                if(arr[man]==0) {
                    count++;
                    arr[man] = 1;
                }
            }
        }
        System.out.println("The unique postions are: "+count);
    }
}