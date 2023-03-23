package GenStackPackMy;

// Demonstrate the GenStack class.
class GenStackDemo {
    public static void main(String[] args) {
        int i;

        // Construct 10-element Character queue.
        Character[] cStore = new Character[10];
        var q1 = new GenStack<Character>(cStore);

        Character cVal;
        // show put characters onto q1
        System.out.println("Input stack of Characters: ");
        try {
            for (i = 0; i < 15; i++) {
                cVal = (char) ('A' + i);
                q1.push(cVal);
                System.out.print(cVal + " ");
            }
            System.out.println();
        }
        catch (StackFullException exc) {
            System.out.println(exc);
        }
        System.out.println();


        // Create stack from stack
        GenStack q3 = new GenStack(q1);


        // Show the queue.
        System.out.println("Contents for q3 stack of Characters: ");
        try {
            for (i = 0; i < 15; i++) {
//                cVal = q3.pop();
                System.out.print(q3.pop() + " ");
            }
            System.out.println("\n");
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }

        System.out.println("Contents for q1 stack of Characters: ");
        try {
            for (i = 0; i < 15; i++) {
//                cVal = q3.pop();
                System.out.print(q1.pop() + " ");
            }
            System.out.println("\n");
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }



        // Construct 10-element Integer queue.
        var iStore = new Integer[10];
        var q2 = new GenStack<Integer>(iStore);

        Integer iVal;
        // show put characters onto q1
        System.out.println("\n");
        System.out.println("Input stack of Integers: ");
        try {
            for (i = 0; i < 15; i++) {
                q2.push(i);
                System.out.print(i + " ");
            }
            System.out.println();
        }
        catch (StackFullException exc) {
            System.out.println(exc);
        }
        System.out.println();


//        GenStack q2 = new GenStack(q1);

        // Show the queue.
        System.out.println("Contents for stack of Integers: ");
        try {
            for (i = 0; i < 15; i++) {
                System.out.print(q2.pop() + " ");
            }
            System.out.println("\n");
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }



        Character[] name = {'A', 'B', 'C'};
        var q4 = new GenStack<Character>(name);

        // Show the queue.
        System.out.println("\n");
        System.out.println("Contents for stack of q4: ");
        try {
            for (i = 0; i < 5; i++) {
                System.out.print(q4.pop() + " ");
            }
            System.out.println("\n");
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }


    }
}