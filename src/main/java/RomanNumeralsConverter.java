/**
 * @author xiaoliang
 * @since 2019-06-13
 */
public class RomanNumeralsConverter {
    public String convert(int n) {
        Symbol symbol = null;

        for (Symbol current : Symbol.values()) {
            symbol = current;
            if (n >= symbol.value) {
                return symbol.name() + convert(n - symbol.value);
            }
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
