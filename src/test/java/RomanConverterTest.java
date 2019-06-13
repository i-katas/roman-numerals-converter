import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author xiaoliang
 * @since 2019-06-13
 */
public class RomanConverterTest {
    private final RomanConverter converter = new RomanConverter();

    @Test
    public void one() {
        assertThat(converter.convert(1), equalTo("I"));
    }
}
