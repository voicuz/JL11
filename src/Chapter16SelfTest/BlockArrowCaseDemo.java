package Chapter16SelfTest;

// Use blocks with the arrow case.
// Refactor for Chapter 16 Self Test, question 14.

record Shipping<T>(T method, boolean extraCharge) {}

class BlockArrowCaseDemo {

    enum ShipMethod {STANDARD, TRUCK, AIR, OVERNIGHT}

    public static void main(String[] args) {

        int productID = 5099;
        boolean extraCharge = false;

        // Here, the switch expression uses a record to efficiently yield two values.
        Shipping shipBy = switch (productID) {
            case 1774, 8708, 6709 -> new Shipping(ShipMethod.TRUCK, true);
            case 4657, 2195, 1887, 3621 -> new Shipping<>(ShipMethod.AIR, false);
            case 2907, 5099 -> new Shipping<>(ShipMethod.OVERNIGHT, true);
            default -> new Shipping<>(ShipMethod.STANDARD, true);
        };
            System.out.println("Shipping method for product number " + productID + " is " + shipBy.method());

            if(shipBy.extraCharge()) System.out.println("Extra charge required.");
        }
}
