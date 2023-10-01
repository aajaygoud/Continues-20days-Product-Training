public class Main {

    public static void main(String[] args) {
        int numberOfDisks = 3; // Change this to the desired number of disks
        solveHanoi(numberOfDisks, 'A', 'B', 'C');
    }

    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from peg " + source + " to peg " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary peg using the destination peg
        solveHanoi(n - 1, source, destination, auxiliary);

        // Move the nth disk from source to destination peg
        System.out.println("Move disk " + n + " from peg " + source + " to peg " + destination);

        // Move the n-1 disks from auxiliary peg to destination peg using the source peg
        solveHanoi(n - 1, auxiliary, source, destination);
    }
}
