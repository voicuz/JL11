// Use a generic functional interface.

// A generic functional interface with two parameters that returns a boolean result.
interface SomeTest<T> {
 boolean test(T n, T m);
}

class GenericFunctionalInterfaceDemo {
 public static void main(String[] args) {

  // This lambda expression determines if one integer is a factor of another.
  SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

  if(isFactor.test(10, 2))
   System.out.println("2 is factor of 10");
  System.out.println();

  // Next lambda expression determines if one double is factor of another.
  SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;

  if(isFactorD.test(212.0, 4.0))
   System.out.println("4.0 is factor of 212.0");
  System.out.println();

  // Next lambda expression determines if one String is factor of another.
  SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;

  String str = "Generic Functional Interface";

  System.out.println("Testing string: " + str);

  if(isIn.test(str, "face"))
   System.out.println("'face' is found.");
  else
   System.out.println("'face' not is found.");
 }
}
