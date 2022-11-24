package fizzbuzz;

public class FizzRule extends Rule {
    public FizzRule() {
    }

    @Override
    public boolean appliesTo(int number) {
        return isMultipleOf(5, number);
    }

    @Override
    protected String doApply(int number) {
        return "Fizz";
    }

    private boolean isMultipleOf(int base, int number) {
        return (number % base) == 0;
    }
}
