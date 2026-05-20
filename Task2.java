public class Task2 {
    public static void main(String[] args) {

        // primitive variables
        char letter1 = 'H';
        byte three = 3;
        short one = 1;
        int zero = 0;
        float version = 2.0f;
        boolean value = true;

        // concatenate into one string
        String output = letter1 + "" + three + one + one + zero
                + " w" + zero + "rld "
                + version + " " + value;

        // print output
        System.out.println(output);
    }
}
