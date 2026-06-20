public class Task8 {

    public static int sum(int... numbers) {
        int total = 0;

        for (int n : numbers) {
            int cumulative = 0;

            for (int i = 1; i <= n; i++) {
                cumulative += i;
            }

            System.out.println("Sum from 1 to " + n + " = " + cumulative);
            total += cumulative;
        }

        return total;
    }

    public static void main(String[] args) {
        int result = sum(4, 5, 10);
        System.out.println("Total Sum = " + result);
    }
}
