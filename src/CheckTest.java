import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CheckTest {

    @org.junit.jupiter.api.Test
    void palindrom() {
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(Main.texts));
        String s1 = String.valueOf(stringBuffer.reverse());
        String s2 = s1.toString();
        Assert.assertEquals(s1,s2);
    }

    @org.junit.jupiter.api.Test
    void oneLatter() {
        String s="abrakadabra";
        char ch1 = s.charAt(0);
           Assert.assertEquals(s.charAt(5), s.charAt(0));
    }
}