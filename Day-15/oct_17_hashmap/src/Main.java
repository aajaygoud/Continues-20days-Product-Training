import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"ajay");
        map.put(2,"goud");
        map.put(3,"Pochanagari");
        map.put(888,"null");
        System.out.println("The value of the key is: "+map.get(4));
        //map.put(4,"njdk");
        System.out.println("The value of the key is: "+map.get(4));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("goud"));
        map.put(1,"arraya");
        //System.out.println(map.get(1));

        for(Integer i:map.keySet()){
            System.out.println(i+" "+map.get(i));
        }

    }
}