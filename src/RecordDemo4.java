// Use a non-canonical constructor for Item.

// Declare an Item record that explicitly declares both a canonical and non-canonical constructor.
record Item(String name, int itemNum, double price) {

    // This compact canonical constructor throws and exception if the name parameter is empty.
    public Item {
        if(name.length() == 0)
            throw new IllegalArgumentException("Item name is empty.");
    }

    static double pricePending = -1;

    // This is a non-canonical constructor.
    // It creates a record in which the price of the item as a string instead of a double.
    // Thus, it has to be converted to a double when passed to the canonical constructor.
    public Item(String name, int itemNum, String price) {
        this(name, itemNum, Double.parseDouble(price));
    }

    double discountPrice(double percentage) {
        return price - (price * percentage / 100);
    }
}

class RecordDemo4 {
    public static void main(String[] args) {
        // Create an array of Item records.
        Item[] items = new Item[4];

        // Create some item entries. These will use the implicit canonical constructor.
        items[0] = new Item("Hammer", 257, 10.99);
        items[1] = new Item("Wrench", 18, 19.29);

        // These use the non-canonical constructor because price is passed as a string, not double.
        items[2] = new Item("", 903, "22.25");
        items[3] = new Item("Saw", 27, "34.59");

        items[0].pricePending = 1;
        System.out.println(items[0].pricePending);


        // Use the record accessor to display the list of items.
        for (Item i:
                items) {
            System.out.print(i.name() + ", Item number " + i.itemNum() + ", Price: " + i.price());
            System.out.println(" Discounted price at 50%: " + i.discountPrice(50));
        }
    }
}
