/**
 * @author xiaoliang
 * @since 2019-06-13
 */
public class RomanNumeralsConverter {
    public String convert(int n) {
        if (n >= Symbol.V.value) {
            return Symbol.V.name() + convert(n - Symbol.V.value);
        }
        if (n >= Symbol.IV.value) {
            return Symbol.IV.name() + convert(n - Symbol.IV.value);
        }
        if (n >= Symbol.I.value) {
            return Symbol.I.name() + convert(n - Symbol.I.value);
        }
        return "";
    }

    private enum Symbol {
        V(5), IV(4), I(1);

        private final int value;

        Symbol(int value) {
            this.value = value;
        }
    }
}
