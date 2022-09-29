package n2;

public class Main {
    public static void main(String[] args) {
        NumberTester nt = new NumberTester("numFile.txt");
        nt.setOddEvenTester();
        nt.setPrimeTester();
        nt.setPalindromeTester((x) -> isPalindrome(String.valueOf(x)));
    }
}