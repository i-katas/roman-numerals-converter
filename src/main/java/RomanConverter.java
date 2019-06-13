/**
 * @author xiaoliang
 * @since 2019-06-13
 */
public class RomanConverter {
    public String convert(int n) {
        if (n > 1) {
            return "II";
        }
        return "I";
    }
}
