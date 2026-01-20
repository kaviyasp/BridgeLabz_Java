package objectorientedprogramming.constructors;

/*
Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights. Use default, parameterized, and copy constructors to initialize bookings.
*/
class HotelBooking {

    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    void display() {
        System.out.println(guestName + " | " + roomType + " | Nights: " + nights);
    }

    public static void main(String[] args) {

        // Object using default constructor
        HotelBooking h1 = new HotelBooking();

        // Object using parameterized constructor
        HotelBooking h2 = new HotelBooking("Ravi", "Deluxe", 3);

        // Object created by copying another object
        HotelBooking h3 = new HotelBooking(h2);

        h1.display();
        h2.display();
        h3.display();
    }
}
