package fizzbuzz;

public class FizzRule {
    public FizzRule() {
    }

    String evaluate(int number) {
        if (isMultipleOfFive(number))
            return "Fizz";
        return "";
    }

    boolean isMultipleOfFive(int number) {
        return (number % 5) == 0;
    }
}