package fizzbuzz;

public class BuzzRule {
    public BuzzRule() {
    }

    String evaluate(int number) {
        if (isMultipleOf(7, number))
            return "Buzz";
        return "";
    }

    private boolean isMultipleOf(int base, int number) {
        return (number % base) == 0;
    }
}