
//TIME COMPLEXITY:  log(n)



/*
        Derived formulae
        for(int i=0;i<n;i++)------->O(n)
        for(int i=0;i<n;i+2)------->O(n)
        for(int i=0;i<n;i+3)------->O(n)


        for(int i=0;i<n;i*2)------->O(log n base 2)
        for(int i=0;i<n;i*3)------->O(log n base 3)
        for(int i=0;i<n;i*4)------->O(log n base 4)
         */

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int n=10;
        for(int i=n;i>=1;i=i/2){
            System.out.println(i);
        }
        /*
        N/2
        N/2 POWER 2
        ....
        ....
        N/2 POWER K
        ASSUME I<1 IT STOPS RIGHT ?
        N/2 POWER K<1
        N/2 POWER K=1
        N==2 POWER K
        K=LOGN BASE 2
        TIME COMPLEXITY:-
        SO,O(LOGN)
         */



    }
}