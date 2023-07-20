public class Sample {

    public native int meth();

    public static void main(String[] args) {
        int n = 0;

        System.out.println("Value of n is " + n);

        assert n > 5 : "Test assertion error";
    }
}
