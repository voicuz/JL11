// Use blocks with the arrow case.
class BlockArrowCaseDemo {

    enum ShipMethod {STANDARD, TRUCK, AIR, OVERNIGHT}

    public static void main(String[] args) {

        int productID = 5099;
        boolean extraCharge = false;

        // Use code blocks with an arrow case. Because the target of the arrow is a block, yield must be used
        // to supply the value. As before, no break statements are used (or legal) because no fall through
        // occurs with the arrow.
        ShipMethod shipBy = switch (productID) {
            case 1774, 8708, 6709 -> {
                extraCharge = true;
                yield ShipMethod.TRUCK;
            }
            case 4657, 2195, 1887, 3621 -> {
                extraCharge = false;
                yield ShipMethod.AIR;
            }
            case 2907, 5099 -> {
                extraCharge = true;
                yield ShipMethod.OVERNIGHT;
            }
            default -> {
                extraCharge = false;
                yield ShipMethod.STANDARD;
            }
        };
            System.out.println("Shipping method for product number " + productID + " is " + shipBy);

            if(extraCharge) System.out.println("Extra charge required.");
        }
}
