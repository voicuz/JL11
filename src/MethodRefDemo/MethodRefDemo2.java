package MethodRefDemo;

// Use a method reference to an instance method.

// Using IntPredicate interface.

/*
// Using MyIntNum class.
// This class stores an int value and defines the instance method isFactor(),
// which returns true if it's argument is a factor of the stored value.

class MyIntNum {
    private int v;

    MyIntNum(int x) {
        v = x;
    }

    int getNum() {return v;}

    // Return true if n is a factor of v.
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
 */

class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // Here, a method reference ot isFactor on myNum is created.
        IntPredicate ip = myNum::isFactor;

        // Now, it is used to call isFactor() via test().
        result = ip.test(3);
        if(result) System.out.println("3 is a factor of " + myNum.getNum());


        // This time, a method reference to isFactor on myNum2 is created,
        // and used to call isFactor() via test().
        ip = myNum2::isFactor;
        result = ip.test(3);
        if(!result) System.out.println("3 is not a factor of " + myNum2.getNum());

        ip = myNum::hasCommonFactor;
        result = ip.test(9);
        if(result) System.out.println("9 has a common factor with " + myNum.getNum());

        ip = myNum2::hasCommonFactor;
        result = ip.test(9);
        if(!result) System.out.println("9 does not have a common factor with " + myNum2.getNum());

        int module = 0;


    }
}
