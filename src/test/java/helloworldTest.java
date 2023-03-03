import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class helloworldTest {
    helloworld obj = new helloworld();
    @Test
    public void factorialTruePositive() {
        assertEquals("Finding factorial of a number for true positive",120,obj.factorial(5));
        assertEquals("Finding factorial of a number for true positive",24,obj.factorial(4));
    }
}
