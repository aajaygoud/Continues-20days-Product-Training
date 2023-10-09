public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s="we@lcome";
        int temp=-1;
        int index=0;
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)<65){
                temp= s.charAt(i);
                index=i;
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            if((s.length()-index)==i){
                ans+=(char)temp;
            }
            else if(s.charAt(i)>50){
                ans+=s.charAt(i);
            }


        }

        System.out.println(ans);
    }
}