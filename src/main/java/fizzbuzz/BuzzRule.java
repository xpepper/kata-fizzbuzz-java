package fizzbuzz;

public class BuzzRule implements Rule {
    public BuzzRule() {
    }

    @Override
    public boolean appliesTo(int number) {
        return isMultipleOf(7, number);
    }

    @Override
    public String apply(int number) {
        return "Buzz";
    }

    private boolean isMultipleOf(int base, int number) {
        return (number % base) == 0;
    }
}
