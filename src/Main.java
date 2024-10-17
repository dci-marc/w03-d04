import java.util.concurrent.atomic.AtomicLong;

public class Main {
    /**
     * Main method
     * @param args String[]
     */
    public static void main(String[] args) {
        // Exercise 1
        System.out.println("# Exercise 1:");
        int integerValue = 10;
        if (integerValue%2 == 0) {
            System.out.println("My number (10) is even");
        }

        // Exercise 2
        System.out.println("# Exercise 2:");
        int negativeIntegerValue = -15;
        if (negativeIntegerValue < 0) {
            System.out.println("My number (-15) is a negative number");
        }

        // Exercise 3
        System.out.println("# Exercise 3:");
        int number = 5;
        java.util.stream.IntStream.range(1, 10).forEach(i -> {
            System.out.println("The product of " + number + " x " + i + " is " + (number * i));
        });

        // Exercise 4
        System.out.println("# Exercise 4:");
        AtomicLong factorial = new AtomicLong(1);
        java.util.stream.IntStream.range(1, number).forEach(i -> {
            factorial.updateAndGet(v -> v * i);
            System.out.println("The factorial of " + number + " is " + factorial.toString());
        });

        // Exercise 4 - Bonus
        System.out.println("# Exercise 4 - Bonus:");
        int number1 = 3;
        int number2 = 5;
        calculateFactorial(number1, number2);

        // Exercise 5
        System.out.println("# Exercise 5:");
        java.util.stream.IntStream.range(0, 50).forEach(i -> {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
                return;
            }

            if (i % 3 == 0) {
                System.out.println("Fizz");
                return;
            }

            if (i % 5 == 0) {
                System.out.println("Buzz");
                return;
            }

            System.out.println(i);
        });

        // Exercise 6
        System.out.println("# Exercise 6:");
        int myGrade1 = 93;
        if (myGrade1 >= 90) {
            System.out.println("A");
        }

        int myGrade2 = 93;
        if (myGrade2 >= 80 && myGrade2 <= 89) {
            System.out.println("B");
        }

        int myGrade3 = 73;
        if (myGrade3 >= 70 && myGrade3 <= 79) {
            System.out.println("C");
        }

        int myGrade4 = 63;
        if (myGrade4 >= 60 && myGrade4 <= 69) {
            System.out.println("D");
        }

        int myGrade5 = 53;
        if (myGrade5 < 60) {
            System.out.println("F");
        }
    }

    public static void calculateFactorial(int number1, int number2) {
        int sum = number1 + number2;
        AtomicLong factorial = new AtomicLong(1);

        java.util.stream.IntStream.range(1, sum).forEach(i -> {
            factorial.updateAndGet(v -> v * i);
            System.out.println("The factorial of " + number1 + " and " + number2 + " is " + factorial.toString());
        });
    }
}