public class Main {

    public static void main(String[] args) {
	// write your code here
        system();
        variables();
    }
    public static void system() {
        System.out.println("Hello Java :) " );
    }
    public static void variables() {
        int var = 100;
        System.out.println("Initial var: " + var);
        int value = 300;
        System.out.println("Initial value: " + value);
        value = var;
        System.out.println("Updated variable value: " + value);
        var = 200;
        System.out.println("Updated variable var: " + var);
        value = var;
        System.out.println("Again Updated variable value: " + value);
    }
    /** Type    Size    MinValue    MaxValue    LiteralFormat
     * byte     8       -128        127         0
     * short    16      -32768      32767       0
     * int      32      -2147483648 2147483647  0
     * long     64      -9223372036 9223372036  0L
     *                854775808     854775807
     *
     * float    32      1.4*10^-45  3.4*10^38   0.0f
     * double   64      4.9*10^-324 1.7*10^308  0.0 or 0.0d
      */
}
