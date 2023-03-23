package GenQueue;

/*
    Try This 13-1

    Demonstrate a generic queue class.

*/
class GenQDemo {
    public static void main(String[] args) {
        // Create an integer queue.
        Integer[] iStore = new Integer[10];
        GenFixedQueue<Integer> q = new GenFixedQueue<Integer>(iStore);

        Integer iVal;
/*
        System.out.println("Demonstrate a queue of Integers.");
        try {
            for(int i=0; i < 10; i++) {
                System.out.println("Adding " + i + " to q.");
                q.put(i);  // Add integer value to q.
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(int i=0; i < 10; i++) {
                System.out.print("Getting next Integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();



        // Create a Double queue.
        Double[] dStore = new Double[10];
        GenFixedQueue<Double> q2 = new GenFixedQueue<>(dStore);

        Double dVal;

        try {
            for(int i=0; i < 5; i++) {
                System.out.println("Adding " + (double) i/2 + " to q2.");
                q2.put((double) i/2); // Add double value to q2.
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            for(int i=0; i < 5; i++) {
                System.out.print("Getting next Double from q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }



        // Demonstrate circular queue.
        GenCircularQueue<Integer> q3 = new GenCircularQueue<Integer>(iStore);

        System.out.println("Demonstrate circular queue of Integers.");

        try {
            System.out.println("Adding to q3:");
            for(int i=0; i < 10; i++) {
                System.out.print(i + " ");
                q3.put(i);  // Add integer value to q3.
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            System.out.println("Getting next Integer from q3: ");
            for(int i=0; i < 10; i++) {
                iVal = q3.get();
                System.out.print(iVal + " ");
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        System.out.println();
        System.out.println("Putting more in circular queue of Integers.");
        try {
            System.out.println("Adding to q3:");
            for(int i=10; i < 20; i++) {
                System.out.print(i + " ");
                q3.put(i);  // Add integer value to q3.
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            System.out.println("Getting next Integer from q3: ");
            for(int i=0; i < 10; i++) {
                iVal = q3.get();
                System.out.print(iVal + " ");
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        System.out.println();
        // Store and consume from circular queue.
        System.out.println("Store and consume from circular queue.");
        try {
            for(int i=0; i < 20; i++) {
//                System.out.print(i + " ");
                q3.put(i);  // Add integer value to q3.
                iVal = q3.get();
                System.out.print(iVal + " ");
            }
        } catch (QueueFullException | QueueEmptyException exc) {
            System.out.println(exc);
        }

 */

        // Demonstrate dynamic queue with Integer.
        GenDynQueue<Integer> q4 = new GenDynQueue<>(iStore);

        System.out.println("Demonstrate dynamic queue of Integers.");

        try {
            System.out.println("Adding to queue:");
            for(int i=0; i < 15; i++) {
                System.out.print(i + " ");
                q4.put(i);  // Add integer value to q4.
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            System.out.println("Getting next Integer from queue: ");
            for(int i=0; i < 15; i++) {
                iVal = q4.get();
                System.out.print(iVal + " ");
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();


        // Demonstrate dynamic queue with Character
        Character[] cStore = new Character[10];
        Character cVal;
        GenDynQueue<Character> q5 = new GenDynQueue<>(cStore);

        System.out.println();
        System.out.println("Demonstrate dynamic queue of Characters.");

        try {
            System.out.println("Adding to queue:");
            for(int i=0; i < 15; i++) {
                cVal = (char) ('A' + i);
                System.out.print(cVal + " ");
                q5.put(cVal);  // Add integer value to q4.
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            System.out.println("Getting next Character from queue: ");
            for(int i=0; i < 15; i++) {
                cVal = q5.get();
                System.out.print(cVal + " ");
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();


        // Demonstrate dynamic queue with String.
        String[] sStore = new String[5];
        String sVal;
        var q6 = new GenDynQueue<String>(sStore);

        System.out.println();
        System.out.println("Demonstrate dynamic queue of Strings.");

        try {
            System.out.println("Adding to queue:");
            for(int i=0; i < 20; i++) {
                sVal = ("A" + i);
                System.out.print(sVal + " ");
                q6.put(sVal);  // Add integer value to q4.
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
            System.out.println("Getting next String from queue: ");
            for(int i=0; i < 20; i++) {
                sVal = q6.get();
                System.out.print(sVal + " ");
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }

    }
}
