// Convert a switch statement into a switch expression.

class SwitchExprDemo {

    enum ShipMethod {STANDARD, TRUCK, AIR, OVERNIGHT}

    public static void main(String[] args) {

        int productID = 5099;

        // This is a switch expression. The value produced by the yield statement in the case
        // that matches productID is assigned to the shipBy variable

        var shipBy = switch (productID) {
            case 1774, 8708, 6709:
                yield ShipMethod.TRUCK;
            case 4657, 2195, 3621, 1887:
                yield ShipMethod.AIR;
            case 2907, 5099:
                yield ShipMethod.OVERNIGHT;
            default:
                yield ShipMethod.STANDARD;
        };

        System.out.println("Shipping method for product number " + productID + " is " + shipBy);
    }
}
