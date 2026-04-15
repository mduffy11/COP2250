/**
 * MyString.java
 * COP 2250 - Week 11 Lab
 * OO Thinking - Wrapper Class Design
 *
 * DO NOT import any libraries.
 * DO NOT use built-in reverse methods.
 */
public class MyString {

    private String value;

    public MyString(String value) {
        this.value = value;
    }

    // STEP 1 - getValue()
    // public String getValue() {
    //
    // }
    public String getValue() {
        return value;
    }
    // STEP 2 - length()
    // public int length() {
    //
    // }
    public int length() {
        return value.length();
    }
    // STEP 3 - toUpperCase()
    // Return new string -- do NOT reassign value
    // public String toUpperCase() {
    //
    // }
    public String toUpperCase() {
        String upper = "";
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c >= 'a' && c <= 'z') {
                upper += (char)(c - ('a' - 'A'));
            } else {
                upper += c;
            }
        }
        return upper;
    }
    // STEP 4 - reverse()
    // Use a loop -- do NOT use StringBuilder.reverse()
    // public String reverse() {
    //
    // }
    public String reverse() {
        String reversed = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            reversed += value.charAt(i);
        }
        return reversed;
    }
    // STEP 5 - isPalindrome()
    // Hint: use your reverse() method
    // public boolean isPalindrome() {
    //
    // }
    public boolean isPalindrome() {
        return value.equals(reverse());
    }
    // STEP 6 - contains(String sub)
    // public boolean contains(String sub) {
    //
    // }
    public boolean contains(String sub) {
        int subLength = sub.length();
        for (int i = 0; i <= value.length() - subLength; i++) {
            String currentSub = value.substring(i, i + subLength);
            if (currentSub.equals(sub)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        MyString ms = new MyString("racecar");

        // Uncomment as you implement each step
        System.out.println("Value: " + ms.getValue());
        System.out.println("Length: " + ms.length());
        System.out.println("Uppercase: " + ms.toUpperCase());
        System.out.println("Reversed: " + ms.reverse());
        System.out.println("Is palindrome: " + ms.isPalindrome());
        System.out.println("Contains 'ace': " + ms.contains("ace"));
        System.out.println("Contains 'xyz': " + ms.contains("xyz"));
    }
}
