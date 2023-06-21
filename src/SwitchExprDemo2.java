// Use the arrow case "shorthand" to supply the shipping method.
class SwitchExprDemo2 {

    enum ShipMethod {STANDARD, TRUCK, AIR, OVERNIGHT}

    public static void main(String[] args) {

        int productID = 5099;

        // In this switch expression, the value is supplied by use of an arrow case, rather than a yield statement.
        // Notice that no break statements are required because arrow cases do not fall through.
        var shipBy = switch (productID) {
            case 1774, 8708, 6709 -> ShipMethod.TRUCK;
            case 4657, 2195, 1887, 3621 -> ShipMethod.AIR;
            case 2907, 5099 -> ShipMethod.OVERNIGHT;
            default -> ShipMethod.STANDARD;
        };

        System.out.println("Shipping method for product number " + productID + " is " + shipBy);
    }
}
