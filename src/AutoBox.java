/*
// Demonstrate autoboxing/unboxing.
class AutoBox {
    public static void main(String[] args) {

        Integer iOb = 100;  // autobox an int

        int i = iOb;  // auto-unbox

        System.out.println(i + " " + iOb);

    }
}



// Autoboxing/unboxing takes place with method parameters and return values.

class AutoBox2 {
    // This method has an Integer parameter.
    static void m(Integer v) {
        System.out.println("m() received " + v);
    }

    // This method returns and int.
    static int m2() {
        return 10;
    }

    // This method returns an integer.
    static Integer m3() {
        return 99;  // autoboxing 99 into and Integer.
    }

    public static void main(String[] args) {

        // Pass an int to m(). Because m() has an Integer parameter,
        // the int value passed is automatically boxed.
        m(199);

        // Here, iOb receives the int value returned by m2().
        // This value is automatically boxed so that it can be assigned to iOb.
        Integer iOb = m2();
        System.out.println("Return value from m2() is " + iOb);

        // Next, m3() is called. It returns an Integer value which is
        // auto-boxed into an int.
        int i = m3();
        System.out.println("Return value from m3() is " + i);

        // Next, Math.sqrt() is called with iOb as an argument.
        // In this case, iOb is auto-unboxed and it's value promoted to
        // double, which is the type needed by sqrt().
        iOb = 100;
        System.out.println("Square root of iOb is " + Math.sqrt(iOb));
    }
}

 */

// Autoboxing/unboxing occurs inside expressions.

class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb, iOb2;
        int i;

        iOb = 99;
        System.out.println("Original value of iOb: " + iOb);

        // The following automatically unboxes iOb, performs the increment,
        // and then reboxes the result back into iOb.
        ++iOb;
        System.out.println("After ++iOb: " + iOb);

        // Here, iOb is unboxed, it's value increased by 10,
        // and the result is boxed and stored back into iOb.
        iOb += 10;
        System.out.println("After iOb += 10: " + iOb);

        // Here, iOb is unboxed, the expression is evaluated,
        // and the result is reboxed, and assigned to iOb2.
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 after expression: " + iOb2);

        // The same expression is evaluated, but the result is not reboxed.
        i = iOb + (iOb / 3);
        System.out.println("i after expression: " + i);


        for (iOb=0; iOb<4; iOb++) {
        switch (iOb) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("error");
        }
        }
    }
}