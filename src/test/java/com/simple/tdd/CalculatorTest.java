package java.com.simple.tdd;

import org.junit.Test;


public class CalculatorTest {
    @Test
    public void 계산기(){
        Calculator calculator = new Calculator();

        int calculator0 = calculator.multiply(2,3);
        //assertEquals(5,add);

        System.out.println(calculator0);
    }

}
