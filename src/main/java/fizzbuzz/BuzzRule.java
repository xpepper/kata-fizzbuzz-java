package fizzbuzz;

public class BuzzRule {
    public BuzzRule() {
    }

    String evaluate(int number) {
        if (isMultipleOfSeven(number))
            return "Buzz";
        return "";
    }

    boolean isMultipleOfSeven(int number) {
        return (number % 7) == 0;
    }
}