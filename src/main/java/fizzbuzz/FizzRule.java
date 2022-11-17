package fizzbuzz;

public class FizzRule implements Rule {
    public FizzRule() {
    }

    @Override
    public boolean appliesTo(int number) {
        return isMultipleOf(5, number);
    }

    @Override
    public String apply(int number) {
        if (!appliesTo(number))
            throw new RuntimeException("Cannot apply rule " + this.getClass());

        return doApply(number);
    }

    protected String doApply(int number) {
        return "Fizz";
    }

    private boolean isMultipleOf(int base, int number) {
        return (number % base) == 0;
    }
}
