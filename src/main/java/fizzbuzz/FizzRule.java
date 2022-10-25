package fizzbuzz;

public class FizzRule {
    public FizzRule() {
    }

    String evaluate(int number) {
        if (isMultipleOf(5, number))
            return "Fizz";
        return "";
    }

    private boolean isMultipleOf(int base, int number) {
        return (number % base) == 0;
    }
}