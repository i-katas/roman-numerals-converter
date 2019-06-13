/**
 * @author xiaoliang
 * @since 2019-06-13
 */
public class RomanNumeralsConverter {
    public String convert(int n) {
        StringBuilder outcome = new StringBuilder();
        for (Symbol current : Symbol.values()) {
            while (n >= current.value) {
                outcome.append(current.name());
                n -= current.value;
            }
        }
        return outcome.toString();
    }

    private enum Symbol {
        M(1000), CM(900), D(500), CD(400), C(100), XC(90), L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);

        private final int value;

        Symbol(int value) {
            this.value = value;
        }
    }
}
