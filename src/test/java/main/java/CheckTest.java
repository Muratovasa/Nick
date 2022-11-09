package main.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static main.java.Check.oneLatter;
import static main.java.Check.palindrom;
import static org.junit.jupiter.api.Assertions.*;

class CheckTest {
    public static Stream<Arguments> soursePoli() {
        return Stream.of(Arguments.of("ооолово", false),
                Arguments.of("МЫШЬ", false),
                Arguments.of("боб", true));
    }

    @ParameterizedTest
    @MethodSource("soursePoli")
    void testPalindrom(String word, boolean expected) {
        boolean rez = Check.palindrom(word);
        assertEquals(expected, rez);
    }

    @Test
    void testOneLatter() {
        String word="akjgnezl/n";
        boolean ch=oneLatter(word);
        assertFalse(ch);
    }

    @Test
    void testVozrastanie() {
        String word = "frst";
        boolean ext = Check.vozrastanie(word);
        assertFalse(ext);
    }

    @Test
    void testGenerateText() {
        String text1 = Check.generateText("hxfjgfvlhbkj", 3);
        assertNotNull(text1);
    }
}