/*
// A simple Record example.

// Declare an Item record. This automatically creates a record class with private, final fields called name,
// itemNum, and price, and with read-only accessors called name(), itemNum(), and price().
record Item(String name, int itemNum, double price) {}

class RecordDemo {
    public static void main(String[] args) {
        // Create an array of Item records.
        Item[] items = new Item[4];

        // Fill the array with items.
        // Notice how each record is constructed. The arguments are automatically assigned to the name, itemNum, and
        // price fields in the record that is being created.
        items[0] = new Item("Hammer", 257, 10.99);
        items[1] = new Item("Wrench", 18, 19.29);
        items[2] = new Item("Drill", 903, 22.25);
        items[3] = new Item("Saw", 27, 34.59);


        // Use the record accessor to display the list of items.
        for (Item i:
             items) {
            System.out.println(i.name() + ", Item number " + i.itemNum() + ", Price: " + i.price());
        }
    }
}


 */