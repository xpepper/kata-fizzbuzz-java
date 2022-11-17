package fizzbuzz;

public class ToStringRule implements Rule {
    public ToStringRule() {
    }

    public String evaluate(int number) {
        return apply(number);
    }

    @Override
    public String apply(int number) {
        return String.valueOf(number);
    }

    @Override
    public boolean appliesTo(int number) {
        return true;
    }
}
