import java.util.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //ArrayList<Integer> list1=new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();

        String a="123";
        char[] ch=a.toCharArray();
        for(int i=0;i<8;i++) {

            for (int j = 0; j < a.length(); j++) {
                if (((i >> j) & 1) == 1) {
                    int ans=ch[j];
                    list.add(ans);
                }
            }


            System.out.println(list);
        }
    }


}