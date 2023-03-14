/*

// In this version of NumericFns, the type argument
// for T must be either Number, or a class derived
// from Number.
class NumericFns<T extends Number> {
    T num;

    // Pass the constructor a reference to
    // a numeric object.
    NumericFns(T n) {
        num = n;
    }

    // Return the reciprocal.
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Return the fractional component.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }
}

 */

class Pair<T, V extends T> {
    T first;
    V second;

    Pair(T a, V b) {
        first = a;
        second = b;
    }
}



// Demonstrate NumericFns.
class BoundsDemo {
    public static void main(String[] args) {

        var iOb = new NumericFns<>(5);

        System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
        System.out.println("Fractional component of iOb is " + iOb.fraction());

        System.out.println();

        var dOb = new NumericFns<>(5.25);

        System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
        System.out.println("Fractional component of dOb is " + dOb.fraction());

        // This won't compile because String is not a
        // subclass of Number.
//        var strOb = new NumericFns<String>("Error");

        Pair<Integer, Integer> x = new Pair<> (1,2);
        Pair<Number, Double> y = new Pair<> (1,2.0);

//        Pair<Number, String> z = new Pair<> (1,2.0);

    }
}
