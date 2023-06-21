// Use a traditional switch to obtain the shipping method associated with a product ID.
// Most products use standard shipping, but a few require special handling.

class TraditionalSwitch {

    enum ShipMethod { STANDARD, TRUCK, AIR, OVERNIGHT }

    public static void main(String[] args) {
        ShipMethod shipBy;

        int productID = 5099;

        // Here, a traditional switch is used to obtain the shipping method.
        // Notice that case stacking is used.
        switch (productID) {
            case 1774, 8708, 6709:
                shipBy = ShipMethod.TRUCK;
                break;
            case 4657:
            case 2195:
            case 3621:
            case 1887:
                shipBy = ShipMethod.AIR;
                break;
            case 2907:
            case 5099:
                shipBy = ShipMethod.OVERNIGHT;
                break;
            default:
                shipBy = ShipMethod.STANDARD;
        }

        int yeald = 0;

        System.out.println("Shipping method for product number " + productID + " is " + shipBy);
    }
}
