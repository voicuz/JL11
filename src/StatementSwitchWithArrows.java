// Use case arrows with a switch statement. This example uses a switch to count the numbers
// of units produced by three simulated production lines.

class StatementSwitchWithArrows {
    public static void main(String[] args) {
        // Production line counters.
        int line1count = 0;
        int line2count = 0;
        int line3count = 0;

        // Production line number.
        int productionLine;

        for(int i=0; i<10; i++) {
            // Simulate production line output.
            productionLine = (i % 3) + 1;

            // Use arrows with a switch statement. Notice that no value is yielded. Instead, a line counter
            // is updated based on which line produced the unit and a message indicating the unit is displayed.
            switch (productionLine) {
                case 1 -> { line1count++;
                    System.out.println("Line 1 produced a unit");
                }
                case 2 -> { line2count++;
                    System.out.println("Line 2 produced a unit");
                }
                case 3 -> {line3count++;
                    System.out.println("Line 3 produced a unit");
                }
            }
        }
        System.out.printf("Total counts for Lines 1, 2, and 3: %d, %d, %d", line1count, line2count, line3count);
    }
}
