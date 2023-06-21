package MethodRefDemo;

// This class stores an int value and defines the instance method isFactor(),
// which returns true if it's argument is a factor of the stored value.

class MyIntNum<T extends Number> {
    private T v;
    int iv;
    int in;

    MyIntNum(T x) {
        v = x;
    }

    T getNum() {return v;}

    // Return true if n is a factor of v.
    boolean isFactor(T n) {
        iv = (int) v;
        in = (int) n;
        return (iv % in) == 0;
//        return true;
    }

    boolean hasCommonFactor(T n) {
        if (v.intValue() >= n.intValue())
            for(int i=2; i<=v.intValue()/i; i++)
                if(((v.intValue() % i) == 0) && ((n.intValue() % i) == 0))
                    return true;
        return false;
    }
}
