package fizzbuzz;

public class FizzRule {
    public FizzRule() {
    }

    String evaluate(int number, String result) {
        if (isMultipleOfFive(number))
            result += "Fizz";
        return result;
    }

    boolean isMultipleOfFive(int number) {
        return (number % 5) == 0;
    }
}