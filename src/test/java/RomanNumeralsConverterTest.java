import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author xiaoliang
 * @since 2019-06-13
 */
public class RomanNumeralsConverterTest {
    private final RomanNumeralsConverter converter = new RomanNumeralsConverter();

    @Test
    public void romanNumeralSymbols() {
        assertThat(converter.convert(1), equalTo("I"));
        assertThat(converter.convert(4), equalTo("IV"));
        assertThat(converter.convert(5), equalTo("V"));
        assertThat(converter.convert(9), equalTo("IX"));
        assertThat(converter.convert(10), equalTo("X"));
        assertThat(converter.convert(40), equalTo("XL"));
        assertThat(converter.convert(50), equalTo("L"));
        assertThat(converter.convert(90), equalTo("XC"));
        assertThat(converter.convert(100), equalTo("C"));
        assertThat(converter.convert(400), equalTo("CD"));
        assertThat(converter.convert(500), equalTo("D"));
        assertThat(converter.convert(900), equalTo("CM"));
        assertThat(converter.convert(1000), equalTo("M"));
    }

    @Test
    public void romanNumberThatContainingSameSymbols() {
        assertThat(converter.convert(2), equalTo("II"));
        assertThat(converter.convert(3), equalTo("III"));
    }

    @Test
    public void romanNumberThatContainingDiffSymbols() {
        assertThat(converter.convert(6), equalTo("VI"));
        assertThat(converter.convert(7), equalTo("VII"));
    }

    @Test
    public void none() {
        assertThat(converter.convert(0), equalTo(""));
    }
}
