public class Main {

    public static void main(String[] args) {
	// write your code here
        system();
        variables();
        character();
        booleanValue();
        variableStorage();
        increments();
        compound();
        mathOperation();
        typeConversion();
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

    public static void character() {
        char uValue = 'U';
        char uValue1 = '\u00DA';
        System.out.println(uValue);
        System.out.println(uValue1);
    }
    public static void booleanValue() {
        boolean iLoveJava = true;
        System.out.println(iLoveJava);
    }
    public static void variableStorage() {
        int firstValue = 100;
        System.out.println(firstValue);
        int otherValue = firstValue;
        System.out.println(otherValue);
        firstValue = 40;
        System.out.println(firstValue);
    }
    public static void increments() {
        int myVal = 5;
        System.out.println("incremented myValu: "+ ++myVal);
        System.out.println("decremented myValu: "+ --myVal);
        increment();
    }
    public static void increment() {
        int mayValu = 5;
        System.out.println("incremented myValu: "+ mayValu++);
        System.out.println(mayValu);
        System.out.println("decremented myValu: "+ mayValu--);
        System.out.println(mayValu);
    }
    public static void compound() {
        int myValu = 50;
        myValu -= 5;
        System.out.println(myValu);

        int result = 100;
        int val1 = 5;
        int val2 = 10;
        result /= val1 * val2;
        System.out.println(result);
    }
    public static void mathOperation() {
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC * valC ;
        int result2 = (valA - valB) / (valC * valD);

        System.out.println("MathOperation Result1: " + result1);
        System.out.println("MathOperation Result2: " + result2);

        int result3 = valA / valC * valD + valB;
        int result4 = valA / (valC * (valD + valB));

        System.out.println("MathOperation Result3: " + result3);
        System.out.println("MathOperation Result4: " + result4);

        typeCoversion2();
    }
    public static void typeConversion() {
        int ival = 50;
        long lval = ival;
        System.out.println("Type Conversion : " + lval);
        System.out.println("Type Conversion : " + ival);
    }
    public static void typeCoversion2() {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = byteVal; //Success
        System.out.println("Success");
        //short result1 = longVal; //Failure (ERROR MESSAGE).
        short result2 = (short)byteVal; //Success
        System.out.println("Success: " + result2);

        short result3 = (short) (byteVal - longVal);
        System.out.println("Success "+ "Print result as: " + result3);

        //long result4 = longVal - floatVal; //Failure (ERROR MESSAGE)
        float result4 = longVal - floatVal;
        System.out.println("Success "+ "Print result as: " + result4);

        //float result4 = longVal - doubleVal; //Failure (ERROR MESSAGE)

        //long result5 = shortVal - longVal + floatVal + doubleVal;//Failure (ERROR MESSAGE)

        double result5 = (long)shortVal - longVal + floatVal + doubleVal;
        System.out.println("Success "+ "Print result as: " + result5);
    }
}
