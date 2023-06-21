// A functional interface. Ask the expert.
interface MyTransform<T> {
    void transform(T[] a);
}

class LambdaDemo4 {
    public static void main(String[] args) {
        MyTransform<Double> sqrts = (v) -> {  // or sqrts = (Double[] v) -> {
            for(int i=0; i < v.length; i++) {
                v[i] = Math.sqrt(v[i]);
                System.out.println(v[i]);
            }
        };
        Double[] a = {2.5, 4.0, 5.0, 9.0};
        sqrts.transform(a);
    }
}
