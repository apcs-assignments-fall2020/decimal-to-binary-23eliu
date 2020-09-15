import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testEasy() {
        assertEquals(1, MyMain.binaryToDecimal("1"), "The decimal value of \"1\" should be: " + 1);
        assertEquals(2, MyMain.binaryToDecimal("10"), "The decimal value of \"10\" should be: " + 2);
        assertEquals(3, MyMain.binaryToDecimal("11"), "The decimal value of \"11\" should be: " + 3);
        assertEquals(4, MyMain.binaryToDecimal("100"), "The decimal value of \"100\" should be: " + 4);
        assertEquals(5, MyMain.binaryToDecimal("101"), "The decimal value of \"101\" should be: " + 5);
        assertEquals(6, MyMain.binaryToDecimal("110"), "The decimal value of \"110\" should be: " + 6);
        assertEquals(7, MyMain.binaryToDecimal("111"), "The decimal value of \"111\" should be: " + 7);
        assertEquals(8, MyMain.binaryToDecimal("1000"), "The decimal value of \"1000\" should be: " + 8);
    }

    @Test
    public void testHard() {
        assertEquals(0, MyMain.binaryToDecimal("0"), "The decimal value of \"0\" should be: " + 0);
        assertEquals(170, MyMain.binaryToDecimal("10101010"), "The decimal value of \"10101010\" should be: " + 170);
        assertEquals(1023, MyMain.binaryToDecimal("1111111111"), "The decimal value of \"1111111111\" should be: " + 1023);
        assertEquals(65, MyMain.binaryToDecimal("1000001"), "The decimal value of \"1000001\" should be: " + 65);
    }
}
