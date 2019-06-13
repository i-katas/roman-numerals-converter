/**
 * @author xiaoliang
 * @since 2019-06-13
 */
public class RomanNumeralsConverter {
    public String convert(int n) {
        if (n == 4) {
            return "IV";
        }
        if (n > 1) {
            return "I" + convert(n - 1);
        }
        return "I";
    }
}
