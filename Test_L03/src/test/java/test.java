import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.example.CombinationCalculator;
import org.junit.Before;
import org.junit.Test;
public class test {
    public CombinationCalculator combination;

    @Before
    public void setup(){
        combination  = new CombinationCalculator();
    }

    @Test
    public void test_5_2(){
        assertEquals(10, combination.calculateCombination(5,2));

    }

    @Test
    public void testCombination_12_10() {
        assertEquals(66, combination.calculateCombination(12, 10));
    }

    @Test
    public void testCombination_6_6() {
        assertEquals(1, combination.calculateCombination(6, 6));
    }

    @Test
    public void testCombination_15_2() {
        assertEquals(105, combination.calculateCombination(15, 2));
    }

    @Test
    public void testCombination_15_14() {
        assertEquals(15, combination.calculateCombination(15, 14));
    }

    @Test
    public void testCombination_3_0() {
        assertEquals(1, combination.calculateCombination(3, 0));
    }

    @Test
    public void testNonIntegerInput() {
        assertThrows(IllegalArgumentException.class, () -> combination.calculateCombination( 2.5, 3));
    }

    @Test
    public void testNZero() {
        assertThrows(IllegalArgumentException.class, () -> combination.calculateCombination(0, 2));
    }

    @Test
    public void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> combination.calculateCombination(-14, 3));
    }

    @Test
    public void testTooLargeInput() {
        assertThrows(IllegalArgumentException.class, () -> combination.calculateCombination(1000, 2));
    }

}
