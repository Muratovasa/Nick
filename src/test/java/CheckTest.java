package test.java;
import main.java.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CheckTest {

    @Test
    void palindrom() {
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(Main.texts));
        StringBuffer rezult = stringBuffer.reverse();
        Assertions.assertEquals(stringBuffer,rezult);
    }

    @ParameterizedTest
    @ValueSource(strings={"abcdefghijklmnopqrstuvweyz"})
    void vozrastanie(String input) {
           Assertions.assertTrue(input.contains("s"));
    }
}