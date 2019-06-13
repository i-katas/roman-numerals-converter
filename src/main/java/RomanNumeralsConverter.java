/**
 * @author xiaoliang
 * @since 2019-06-13
 */
public class RomanNumeralsConverter {
    public String convert(int n) {
        if (n >= 5) {
            return "V" + convert(n - 5);
        }
        if (n >= 4) {
            return "IV";
        }
        if (n >= 1) {
            return "I" + convert(n - 1);
        }
        return "";
    }
}
