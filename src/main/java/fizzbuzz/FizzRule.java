package fizzbuzz;

public class FizzRule {
    public FizzRule() {
    }

    public String apply() {
        return "Fizz";
    }

    public boolean appliesTo(int number) {
        return isMultipleOf(5, number);
    }

    private boolean isMultipleOf(int base, int number) {
        return (number % base) == 0;
    }
}
