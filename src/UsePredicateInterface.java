// Use the Predicate built-in functional interface.

// Import the predicate interface.
import java.util.function.Predicate;

class UsePredicateInterface {
    public static void main(String[] args) {

        // This lambda uses Predicate<Integer> to determine if a number is even.
        Predicate<Integer> isEven = (n) -> (n % 2) == 0;

        if(isEven.test(4)) System.out.println("Four is even.");
        if(!isEven.test(5)) System.out.println("Five is odd.");
    }
}
