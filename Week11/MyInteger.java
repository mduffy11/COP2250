/**
 * MyInteger.java
 * COP 2250 - Assignment 10
 * OO Thinking - Wrapper Class (Liang 10.3)
 *
 * Name: Duffy, Michael
 * Date: 4/14/2024
 */
public class MyInteger {

    // STEP 1 - Declare private int field: value
    // private int value;
    private int value;

    // STEP 2 - Constructor
    // public MyInteger(int value) {
    //
    // }
    public MyInteger(int value) {
        this.value = value;
    }

    // STEP 3 - getValue()
    // public int getValue() {
    //
    // }
    public int getValue() {
        return value;
    }

    // STEP 4 - isEven() [instance]
    // public boolean isEven() {
    //
    // }
    public boolean isEven() {
        return value % 2 == 0;
    }

    // STEP 5 - isOdd() [instance]
    // public boolean isOdd() {
    //
    // }
    public boolean isOdd() {
        return value % 2 != 0;
    }

    // STEP 6 - isPrime() [instance]
    // public boolean isPrime() {
    //
    // }
    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }

    // STEP 7 - isEven(int n) [static]
    // STEP 8 - isOdd(int n)  [static]
    // STEP 9 - isPrime(int n) [static]
    // public static boolean isEven(int n)  { ... }
    // public static boolean isOdd(int n)   { ... }
    // public static boolean isPrime(int n) { ... }
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // STEP 10 - isEven(MyInteger m)  [static]
    // STEP 11 - isOdd(MyInteger m)   [static]
    // STEP 12 - isPrime(MyInteger m) [static]
    // Hint: call the int version using m.getValue()
    // public static boolean isEven(MyInteger m)  { ... }
    // public static boolean isOdd(MyInteger m)   { ... }
    // public static boolean isPrime(MyInteger m) { ... }
    public static boolean isEven(MyInteger m) {
        return isEven(m.getValue());
    }

    public static boolean isOdd(MyInteger m) {
        return isOdd(m.getValue());
    }

    public static boolean isPrime(MyInteger m) {
        return isPrime(m.getValue());
    }

    // STEP 13 - equals(int n)
    // public boolean equals(int n) {
    //
    // }
    public boolean equals(int n) {
        return value == n;
    }

    // STEP 14 - equals(MyInteger m)
    // public boolean equals(MyInteger m) {
    //
    // }
    public boolean equals(MyInteger m) {
        return value == m.getValue();
    }

    // STEP 15 - parseInt(String s) [static]
    // Do NOT use Integer.parseInt()
    // public static int parseInt(String s) {
    //
    // }
    public static int parseInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c < '0' || c > '9') {
                throw new NumberFormatException("Invalid character: " + c);
            }

            result = result * 10 + (c - '0');
        }

        return result;
    }

    // STEP 16 - parseInt(char[] chars) [static]
    // public static int parseInt(char[] chars) {
    //
    // }
    public static int parseInt(char[] chars) {
        int result = 0;

        for (char c : chars) {
            if (c < '0' || c > '9') {
                throw new NumberFormatException("Invalid character: " + c);
            }

            result = result * 10 + (c - '0');
        }

        return result;
    }

    public static void main(String[] args) {
        // Run the separate test class.
        TestMyInteger.main(args);
    }
}

// Create a separate test class in the same file.
class TestMyInteger {
    public static void main(String[] args) {
        // Create test objects.
        MyInteger m1 = new MyInteger(7);
        MyInteger m2 = new MyInteger(4);

        // Demonstrate all instance methods.
        System.out.println("Value: " + m1.getValue());
        System.out.println("isEven (instance): " + m1.isEven());
        System.out.println("isOdd (instance): " + m1.isOdd());
        System.out.println("isPrime (instance): " + m1.isPrime());

        // Demonstrate all static int methods.
        System.out.println("isEven(int 4): " + MyInteger.isEven(4));
        System.out.println("isOdd(int 7): " + MyInteger.isOdd(7));
        System.out.println("isPrime(int 7): " + MyInteger.isPrime(7));

        // Demonstrate all static MyInteger methods.
        System.out.println("isEven(MyInteger m2): " + MyInteger.isEven(m2));
        System.out.println("isOdd(MyInteger m1): " + MyInteger.isOdd(m1));
        System.out.println("isPrime(MyInteger m1): " + MyInteger.isPrime(m1));

        // Demonstrate both equals methods.
        System.out.println("equals(int 7): " + m1.equals(7));
        System.out.println("equals(MyInteger m2): " + m1.equals(m2));

        // Demonstrate both parseInt methods.
        System.out.println("parseInt(String): " + MyInteger.parseInt("1234"));
        System.out.println("parseInt(char[]): " + MyInteger.parseInt(new char[]{'5', '6', '7'}));
    }
}