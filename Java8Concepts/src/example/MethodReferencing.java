package example;

import java.util.Arrays;
import java.util.List;

class MethodReferencing {
    public static void main(String[] args) {
        // Reference to a static method
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(MethodReferencing::printNumber);

        // Reference to an instance method of a particular object
        String message = "Hello, World!";
        GreetingPrinter greetingPrinter = new GreetingPrinter();
        numbers.forEach(greetingPrinter::printWithGreeting);

    }

    public static void printNumber(Integer number) {
        System.out.println(number);
    }
}

class GreetingPrinter {
    public void printWithGreeting(Integer number) {
        System.out.println("Greetings! The number is: " + number);
    }
}
