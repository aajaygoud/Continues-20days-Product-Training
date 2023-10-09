import java.util.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        adjDup("","abbaca");
    }
    public static void adjDup(String unp,String p){
        if(p.length()==0){
            System.out.println(unp);
            return;
        }
        if(p.length()==1){
            unp+=p;
            System.out.println(unp);
            return;
        }
        else{
            if(p.charAt(0)==p.charAt(1)){
                adjDup(unp,p.substring(2));
            }
            else{

                    if(unp.charAt(0)==p.charAt(0)){
                        adjDup("",p.substring(1));
                    }


                else{
                    adjDup(unp+p.charAt(0),p.substring(1));
                }

            }
        }
    }


}