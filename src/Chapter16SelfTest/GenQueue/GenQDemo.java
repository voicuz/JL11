package Chapter16SelfTest.GenQueue;

/*
    Reworked Try This 13-1 for Chapter 16 Self Test, questions 12 and 13.

    Demonstrate a generic queue class.
    Added record Item.

*/

record Item<T extends Number>(String name, int itemNum, T price) {}

class RecordGenQDemo {
    public static void main(String[] args) {
        // Create a queue for Item records.
        Item[] items = new Item[4];
        GenFixedQueue<Item> qI = new GenFixedQueue<>(items);

        // Create some item records.
        items[0] = new Item("Hammer", 257, 10.99);
        items[1] = new Item("Wrench", 18, 19.29);
        items[2] = new Item("Drill", 903, 22.25);
        items[3] = new Item("Saw", 27, 34.59);

        System.out.println("Demonstrate a queue of Items.");
        try {
            for(int i=0; i < items.length; i++) {
                System.out.println("Adding " + items[i].name() + " to queue qI.");
                qI.put(items[i]);  // Add item to qI.
            }
        } catch (QueueFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        // Retrieve records from queue.
        try {
            Item t;
            for(int i=0; i < items.length; i++) {
                System.out.print("Getting next Item from q: ");
                t = qI.get();
                System.out.println(items[i].name() + ", Item number " + items[i].itemNum() + ", Price: " + items[i].price());
            }
        } catch (QueueEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();



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
