/*
// Use a compact canonical constructor for Item.

record Item(String name, int itemNum, double price) {

    public Item {
        // Remove leading and tailing spaces by the use of the trim() method defined by the String class.
        name = name.trim();

        // The itemNum and price fields are automatically assigned the values of their corresponding parameters
        // when the constructor ends.
    }
}

class RecordDemo2 {
    public static void main(String[] args) {
        // Create an array of Item records.
        Item[] items = new Item[4];

        // Notice how each record is constructed. Here, no leading or trailing spaces are present in the name.
        items[0] = new Item("Hammer", 257, 10.99);

        // These entries have leading and/or trailing spaces in their names.
        // The canonical constructor is removing the spaces.
        items[1] = new Item("  Wrench", 18, 19.29);
        items[2] = new Item("Drill  ", 903, 22.25);
        items[3] = new Item("  Saw  ", 27, 34.59);


        // Use the record accessor to display the list of items.
        for (Item i:
                items) {
            System.out.println(i.name() + ", Item number " + i.itemNum() + ", Price: " + i.price());
        }
    }
}


 */