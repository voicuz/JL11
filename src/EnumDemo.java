
/*
// An enumeration for Transport varieties.
enum Transport {
    CAR, TRUCK, AIRPLANE, BOAT, TRAIN
}


class EnumDemo {
    public static void main(String[] args) {
        Transport tp;

        tp = Transport.AIRPLANE;

        // Output an enum value.
        System.out.println("Value of tp: " + tp);
        System.out.println();

        tp = Transport.TRAIN;

        // Compare two enum values.
        if(tp == Transport.TRAIN) {
            System.out.println("tp contains TRAIN.\n");
        }

        // Use enum to control a switch statement.
        switch (tp) {
            case CAR:
                System.out.println("A car caries people.");
                break;
            case TRUCK:
                System.out.println("A tuck caries freight");
                break;
            case AIRPLANE:
                System.out.println("An airplane flies");
                break;
            case TRAIN:
                System.out.println("A train runs on rails.");
                break;
            case BOAT:
                System.out.println("A boat sails on water.");
                break;
        }
    }
}


enum Transport {
    CAR, TRUCK, AIRPLANE, BOAT, TRAIN
}

// Use the built-in enumeration methods.

class EnumDemo2 {
    public static void main(String[] args) {
        Transport tp;

        System.out.println("Here are all Transport constants");

        // use values()
        Transport[] allTransport = Transport.values();
        for (Transport t : allTransport)
            System.out.println(t);

        // another way to write "use values()"
        for (Transport t : Transport.values())
            System.out.println(t);

        System.out.println();

        // use valueOf()
        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);
    }
}

// Use an enum constructor, instance variable and method.

enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), BOAT(22), TRAIN(70);

    private int speed;  // typical speed of each transport

    // Constructor
    Transport(int s) { speed = s; }

    int getSpeed() { return speed; }
}

class EnumDemo3 {
    public static void main(String[] args) {
//        Transport tp;

        // Display speed of an airplane;
        System.out.println("Typical speed for an airplane is " + Transport.AIRPLANE.getSpeed() + " miles per hour.");
        System.out.println();

        for(Transport t : Transport.values()) {
            System.out.println(t + " typical speed is " + t.getSpeed() + " miles per hour.");
        }
    }
}

*/

// Demonstrate ordinal() and comapreTo().

// An enumeration of transport varieties.

enum Transport {
    CAR, TRUCK, AIRPLANE, BOAT, TRAIN
}

class EnumDemo4 {
    public static void main(String[] args) {

        Transport tp, tp2, tp3;
        int i = 1;

        System.out.println("Here all Transport constants and their ordinal values ");
        for (Transport t : Transport.values()) {
            System.out.println(t + " " + t.ordinal());
        }

        tp = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;

        if(tp.compareTo(tp2) < 0) {
            System.out.print(tp + " comes before " + tp2);
        }
        System.out.println(" :" + tp.compareTo(tp2));

        if(tp.compareTo(tp2) > 0) {
            System.out.print(tp2 + " comes before " + tp);
        } else
            System.out.print(tp2 + " does not comes before " + tp);
        System.out.println(" :" + tp2.compareTo(tp));

        if(tp.compareTo(tp3) == 0) {
            System.out.print(tp + " equals " + tp3);
        }
        System.out.println(" :" + tp.compareTo(tp3));
    }
}