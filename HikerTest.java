// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class HikerTest {
    
    @Test
    void inputOfNeg12() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> actual = Hiker.answer(-12);
        assertEquals(expected, actual);
    }
    
    @Test
    void inputOfNeg2() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> actual = Hiker.answer(-2);
        assertEquals(expected, actual);
    }
    
    @Test
    void inputOf0() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0));
        ArrayList<Integer> actual = Hiker.answer(0);
        assertEquals(expected, actual);
    }
    
    @Test
    void inputOf1() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> actual = Hiker.answer(1);
        assertEquals(expected, actual);
    }
    
    @Test
    void inputOf2() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2));
        ArrayList<Integer> actual = Hiker.answer(2);
        assertEquals(expected, actual);
    }
    
    @Test
    void inputOf3() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3));
        ArrayList<Integer> actual = Hiker.answer(3);
        assertEquals(expected, actual);
    }
    
    @Test
    void inputOf4() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,2));
        ArrayList<Integer> actual = Hiker.answer(4);
        assertEquals(expected, actual);
    }

    @Test
    void inputOf12() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,2,3));
        ArrayList<Integer> actual = Hiker.answer(12);
        assertEquals(expected, actual);
    }
    
    @Test
    void inputOf27() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3,3,3));
        ArrayList<Integer> actual = Hiker.answer(27);
        assertEquals(expected, actual);
    }
    
    @Test
    void inputOf10() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,5));
        ArrayList<Integer> actual = Hiker.answer(10);
        assertEquals(expected, actual);
    }
    
    @Test
    void inputOf5() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5));
        ArrayList<Integer> actual = Hiker.answer(5);
        assertEquals(expected, actual);
    }
    
    @Test
    void inputOf22() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,11));
        ArrayList<Integer> actual = Hiker.answer(22);
        assertEquals(expected, actual);
    }
    
    @Test
    void inputOf15() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3,5));
        ArrayList<Integer> actual = Hiker.answer(15);
        assertEquals(expected, actual);
    }
    
    @Test
    void inputOf100() {
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,2,5,5));
        ArrayList<Integer> actual = Hiker.answer(100);
        assertEquals(expected, actual);
    }
    
    @Test
    void inputOf1000(){
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2,2,2,5,5,5));
        ArrayList<Integer> actual = Hiker.answer(1000);
    }
    
    @Test
    void inputOf223(){
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(223));
        ArrayList<Integer> actual = Hiker.answer(223);
    }
}
