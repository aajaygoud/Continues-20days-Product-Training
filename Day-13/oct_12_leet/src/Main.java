public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int ans=minimizeXor(1,12); //3,5---->3
        System.out.println(ans);   // 1,12--->3
                                    //31 ,31 --->31

    }

    public static int minimizeXor(int num1, int num2) {
        int count,c,ans1;
        count=c=ans1=0;;
        int ans=0;
        int min=99999;
        int nums2=num2;
        while(num2>0){
            if((num2 & 1)==1){
                count++;
            }
            num2=num2>>1;
        }
        for(int i=0;i<=nums2;i++){
            int a=i;
            c=0;
            while(a>0){
                if((a & 1)==1){
                    c++;
                }
                a=a>>1;

            }
            if(c==count){
                ans=i;
                if((ans^num1)<min)
                {
                    min=Math.min(min,ans^num1);
                    ans1=i;
                    // break;
                }
            }
        }

        return ans1;
    }

}