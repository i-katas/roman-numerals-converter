/**
 * @author xiaoliang
 * @since 2019-06-13
 */
public class RomanNumeralsConverter {
    public String convert(int n) {
        Symbol symbol = null;

        symbol = Symbol.V;
        if (n >= symbol.value) {
            return symbol.name() + convert(n - symbol.value);
        }

        symbol = Symbol.IV;
        if (n >= symbol.value) {
            return symbol.name() + convert(n - symbol.value);
        }

        symbol = Symbol.I;
        if (n >= symbol.value) {
            return symbol.name() + convert(n - symbol.value);
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
