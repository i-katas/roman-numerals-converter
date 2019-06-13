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
    }

    @Test
    public void romanNumberThatContainingSameSymbols() {
        assertThat(converter.convert(2), equalTo("II"));
        assertThat(converter.convert(3), equalTo("III"));
    }
}
