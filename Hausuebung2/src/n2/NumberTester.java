package n2;

import n2.NumberTest;

public class NumberTester {

    public NumberTester(String fileName){

    }

    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }

    public void testFile(){
        switch(){
            case 1:
                setOddEvenTester((number) -> (number%2) == 0);

                break;

            case 2:
                setPrimeTester(number -> );

                break;

            case 3:
                setPalindromeTester(number -> );

                break;
        }
    }
}
