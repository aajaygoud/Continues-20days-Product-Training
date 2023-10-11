import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        String a="7564168";
//        String ans="";
//        char[] ch=a.toCharArray();
//        for(int i=0;i<ch.length;i++){
//            if(i%2!=0){
//                ans+=ch[i];
//            }
//        }
//        char[] arr=ans.toCharArray();
//        int[] fi=new int[arr.length];
//        System.out.println(Arrays.toString(arr));
//        for(int i=0;i<arr.length;i++){
//            fi[i]=arr[i]-'0';
//        }
//        for(int i=0;i<fi.length;i++){
//            fi[i]=fi[i]*fi[i];
//        }
//        System.out.println(Arrays.toString(fi));
       // System.out.println(ans);


        String[] q2={"Abhishek","Mayur","Friend","yeah"};
        String answer="";
        String tem="";
        int[] q2_ar={43848,3749,3949,7878};
        for(int i=0;i< q2.length;i++){
            int len=q2[i].length();
            int max=countmax(q2_ar[i],len);
            tem=q2[i];
            if(max<=tem.length()) {
                answer = answer + tem.charAt(max-1);
            }
            else{
                answer+='x';
            }
        }
        System.out.println(answer);
    }
    public static int countmax(int q2_ar,int len){
        int max=-9999999;
        int re=0;
        while(q2_ar>0){
            re=q2_ar%10;
            if(re<=len){
                max=Math.max(max,re);
            }
            q2_ar/=10;


        }
        if(max==-9999999)
            return 999999;



        return max;
    }
}