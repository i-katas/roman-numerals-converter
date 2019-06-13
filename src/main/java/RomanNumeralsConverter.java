/**
 * @author xiaoliang
 * @since 2019-06-13
 */
public class RomanNumeralsConverter {
    public String convert(int n) {
        for (Symbol current : Symbol.values()) {
            if (n >= current.value) {
                return current.name() + convert(n - current.value);
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
