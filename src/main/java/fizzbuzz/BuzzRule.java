package fizzbuzz;

public class BuzzRule {
    public BuzzRule() {
    }

    public String apply() {
        return "Buzz";
    }

    public boolean appliesTo(int number) {
        return isMultipleOf(7, number);
    }

    private boolean isMultipleOf(int base, int number) {
        return (number % base) == 0;
    }
}
