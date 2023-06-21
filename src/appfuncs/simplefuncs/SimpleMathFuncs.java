// Some simple math functions.

package appfuncs.simplefuncs;
import appsupport.supportfuncs.SupportFuncs;

public class SimpleMathFuncs {

    // Return the smallest positive factor that a and b have in common.
    public static int lcf(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;

        for(int i=2; i <= min/2; i++) {
//            if(isFactor(i, a) && isFactor(i, b))
                return i;
        }
        
        return 1;
    }

    // Return the largest positive factor that a and b have in common.
    public static int gcf(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int min = a < b ? a : b;

        for(int i = min/2; i >= 2; i--) {
            //if(isFactor(i, a) && isFactor(i, b))
                return i;
        }

        return 1;
    }
}
