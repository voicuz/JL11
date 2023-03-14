// Demonstrate Self Test 12, question 3.

enum Tools {
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}

class ST12_3 {
    public static void main(String[] args) {


        for (Tools t: Tools.values()
        ) {
            System.out.println(t + " " + t.ordinal());

        }
    }
}
