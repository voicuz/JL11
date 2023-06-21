//Use a switch expression to obtain the time zone for selected cities in Continental US.
class CityTZDemo {

    // Use enumeration to describe the time zones.
    enum TZ { Eastern, Central, Mountain, Pacific, Other }

    public static void main(String[] args) {

        // Array of various cities in North America.
        String[] cities = {"New York", "Boston", "Miami", "Chicago",
                            "St. Louis", "Des Moines", "Denver",
                            "Albuquerque", "Seattle", "San Francisco", "Los Angeles", "Portland",
                            "Honolulu"
        };

        // Display the time zine for each city in the array.
        for (String city:
             cities) {

            // This expression switch yields an enumeration value that indicates the time zone of a city.
            TZ zone = switch (city) {
                case "New York", "Boston", "Miami" -> TZ.Eastern;
                case "Chicago", "St. Louis", "Des Moines" -> TZ.Central;
                case "Denver", "Albuquerque" -> TZ.Mountain;
                case "Seattle", "San Francisco", "Los Angeles", "Portland" -> TZ.Pacific;
                default -> TZ.Other;
            };

            if(zone == TZ.Other)
                System.out.println(city + " is outside the Continental US.");
            else
                System.out.println(city + " is in the " + zone + " time zone.");
        }
    }
}
