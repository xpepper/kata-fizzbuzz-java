package fizzbuzz;

public class FizzRule {
    public FizzRule() {
    }

    String evaluate(int number) {
        if (appliesTo(number))
            return apply();
        return "";
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
