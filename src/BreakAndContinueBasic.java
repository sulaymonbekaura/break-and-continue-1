public class BreakAndContinueBasic {
    public static void main(String[] args) {
        // break — exit loop early
        System.out.println("=== break: Stop at first multiple of 7 ===");
        for (int i = 1; i <= 30; i++) {
            if (i % 7 == 0) { System.out.println("Found: " + i + " — stopping."); break; }
            System.out.print(i + " ");
        }

        // continue — skip current iteration
        System.out.println("\n\n=== continue: Skip multiples of 3 ===");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) continue;
            System.out.print(i + " ");
        }

        // Search with break
        System.out.println("\n\n=== Linear Search (break when found) ===");
        int[] arr    = {15, 3, 47, 8, 23, 99, 6, 42};
        int   target = 23;
        int   foundAt = -1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("  Checking index " + i + " → " + arr[i]);
            if (arr[i] == target) { foundAt = i; break; }
        }
        System.out.println(target + (foundAt >= 0 ? " found at index " + foundAt : " not found"));

        // continue in while loop
        System.out.println("\n=== Print only even numbers (continue odd) ===");
        int n = 0;
        while (n < 20) {
            n++;
            if (n % 2 != 0) continue;
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
