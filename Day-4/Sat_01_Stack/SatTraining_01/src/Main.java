import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

class Ajay{
    int a,ans;
    String revers="";
     public  void a(String s,int a){

         char[] ab=s.toCharArray();
         for(int i=ab.length-1;i>=0;i--){
             revers+=ab[i];

         }
         System.out.println("Reverse of String: ");
         System.out.println(revers);
         ans=(int)Math.sqrt(a);

     }
     public void display(){
         System.out.println("Length of string is: "+revers.length());
         System.out.println("modulo division "+a%ans);
     }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s=in.next();
        System.out.println("Enter any number: ");
        int no=in.nextInt();
        Ajay jay=new Ajay();
        jay.a(s,no);
        jay.display();

    }
}