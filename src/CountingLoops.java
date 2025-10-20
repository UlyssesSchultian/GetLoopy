public class CountingLoops {
    public static void main(String[] args) {

        System.out.print("Task 1: ");
        for (int i = 0; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        System.out.print("Task 2: ");
        for (int i = 30; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        System.out.print("Task 3: ");
        for (int i = 0; i <= 18; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


        System.out.print("Task 4: ");
        for (int i = 10; i >= 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}