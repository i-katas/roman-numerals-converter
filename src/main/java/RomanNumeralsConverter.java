/**
 * @author xiaoliang
 * @since 2019-06-13
 */
public class RomanNumeralsConverter {
    public String convert(int n) {
        StringBuilder outcome = new StringBuilder();
        for (Symbol current : Symbol.values()) {
            outcome.append(current.presentationsOf(n));
            n -= current.amount(n);
        }
        return outcome.toString();
    }

    private enum Symbol {
        M(1000), CM(900), D(500), CD(400), C(100), XC(90), L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);

        private final int value;

        Symbol(int value) {
            this.value = value;
        }

        private CharSequence presentationsOf(int n) {
            int cardinality = cardinality(n);
            if (cardinality == 0) {
                return "";
            }
            return cardinality == 1 ? name() : repeat(cardinality);
        }

        private CharSequence repeat(int times) {
            StringBuilder result = new StringBuilder(name().length() * times);
            for (int i = 0; i < times; i++) {
                result.append(name());
            }
            return result;
        }

        private int cardinality(int n) {
            return n / value;
        }

        private int amount(int n) {
            return value * cardinality(n);
        }
    }
}
