package calculator;

public class Calculator {
    public int pow(int a, int b) {
        int result = 1;
        for(int i = 0; i<b ; i++){
            result*=a;
        }
        return result;
    }

    public int divide(int a, int b) {
        return a/b;
    }
}
