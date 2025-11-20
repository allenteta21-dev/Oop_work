package ID_27409.Q2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== FLIGHT BOOKING (Q2) ===");

        System.out.print("id (int > 0): ");
        int id = readInt(sc);
        System.out.print("createdDate (yyyy-mm-dd): ");
        String createdDate = readNonEmpty(sc, "1970-01-01");
        System.out.print("updatedDate (yyyy-mm-dd): ");
        String updatedDate = readNonEmpty(sc, "1970-01-01");

        System.out.println("\n--- AIRPORT ---");
        System.out.print("airportName: ");
        String airportName = readNonEmpty(sc, "Unknown Airport");
        System.out.print("airport code (3 uppercase letters): ");
        String airportCode = sc.nextLine().trim();
        if (!airportCode.matches("[A-Z]{3}")) airportCode = "XXX";
        System.out.print("location: ");
        String location = readNonEmpty(sc, "Unknown");

        System.out.println("\n--- AIRLINE ---");
        System.out.print("airlineName: ");
        String airlineName = readNonEmpty(sc, "UnknownAir");
        System.out.print("airlineCode (2-4 letters): ");
        String airlineCode = sc.nextLine().trim();
        if (!airlineCode.matches("[A-Za-z]{2,4}")) airlineCode = "AA";
        System.out.print("contactEmail: ");
        String contactEmail = sc.nextLine().trim();
        if (!contactEmail.contains("@")) contactEmail = "contact@airline.com";

        System.out.println("\n--- FLIGHT ---");
        System.out.print("flightNumber: ");
        String flightNumber = readNonEmpty(sc, "FN000");
        System.out.print("departure: ");
        String departure = readNonEmpty(sc, "Unknown");
        System.out.print("destination: ");
        String destination = readNonEmpty(sc, "Unknown");
        System.out.print("baseFare (>0): ");
        double baseFare = readDouble(sc);
        if (baseFare <= 0) baseFare = 100.0;

        System.out.println("\n--- PILOT ---");
        System.out.print("pilotName: ");
        String pilotName = readNonEmpty(sc, "Captain");
        System.out.print("licenseNumber: ");
        String licenseNumber = readNonEmpty(sc, "LIC000");
        System.out.print("experienceYears (>=2): ");
        int experienceYears = readInt(sc);
        if (experienceYears < 2) experienceYears = 2;

        System.out.println("\n--- CABIN CREW ---");
        System.out.print("crewName: ");
        String crewName = readNonEmpty(sc, "Crew");
        System.out.print("role: ");
        String role = readNonEmpty(sc, "Attendant");
        System.out.print("shift (Day/Night): ");
        String shift = sc.nextLine().trim();
        if (!("Day".equalsIgnoreCase(shift) || "Night".equalsIgnoreCase(shift))) shift = "Day";

        System.out.println("\n--- PASSENGER ---");
        System.out.print("passengerName: ");
        String passengerName = readNonEmpty(sc, "Passenger");
        System.out.print("age (>0): ");
        int age = readInt(sc);
        if (age <= 0) age = 1;
        System.out.print("gender (M/F/Other): ");
        String gender = sc.nextLine().trim();
        if (gender.isEmpty()) gender = "Other";
        System.out.print("contact: ");
        String contact = sc.nextLine().trim();

        System.out.println("\n--- BOOKING ---");
        System.out.print("bookingDate: ");
        String bookingDate = readNonEmpty(sc, "1970-01-01");
        System.out.print("seatNumber: ");
        String seatNumber = readNonEmpty(sc, "0A");
        System.out.print("travelClass (Economy/Business/First): ");
        String travelClass = sc.nextLine().trim();
        if (!(travelClass.equalsIgnoreCase("Economy") || travelClass.equalsIgnoreCase("Business") || travelClass.equalsIgnoreCase("First"))) travelClass = "Economy";

        System.out.println("\n--- PAYMENT ---");
        System.out.print("paymentDate: ");
        String paymentDate = readNonEmpty(sc, "1970-01-01");
        System.out.print("paymentMethod: ");
        String paymentMethod = readNonEmpty(sc, "Card");
        System.out.print("amountPaid (>0): ");
        double amountPaid = readDouble(sc);
        if (amountPaid <= 0) amountPaid = 0.0;

        System.out.println("\n--- TICKET ---");
        System.out.print("ticketNumber: ");
        String ticketNumber = readNonEmpty(sc, "TCKT000");
        System.out.print("issueDate: ");
        String issueDate = readNonEmpty(sc, "1970-01-01");

        // instantiate chain
        Airport airport = new Airport(id, createdDate, updatedDate, airportName, airportCode, location);
        Airline airline = new Airline(id, createdDate, updatedDate, airportName, airportCode, location, airlineName, airlineCode, contactEmail);
        Flight flight = new Flight(id, createdDate, updatedDate, airportName, airportCode, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare);
        Pilot pilot = new Pilot(id, createdDate, updatedDate, airportName, airportCode, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears);
        CabinCrew crew = new CabinCrew(id, createdDate, updatedDate, airportName, airportCode, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift);
        Passenger passenger = new Passenger(id, createdDate, updatedDate, airportName, airportCode, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift, passengerName, age, gender, contact);
        Booking booking = new Booking(id, createdDate, updatedDate, airportName, airportCode, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass);
        Payment payment = new Payment(id, createdDate, updatedDate, airportName, airportCode, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass, paymentDate, paymentMethod, amountPaid);
        Ticket ticket = new Ticket(id, createdDate, updatedDate, airportName, airportCode, location, airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass, paymentDate, paymentMethod, amountPaid, ticketNumber, issueDate);

        // display inputs and computed fare
        System.out.println("\n--- DISPLAY DATA (Q2) ---");
        airport.display();
        airline.display();
        flight.display();
        pilot.display();
        crew.display();
        passenger.display();
        booking.display();
        payment.display();
        ticket.display();

        System.out.printf("Calculated Fare: %.2f%n", ticket.calculateFare());

        sc.close();
    }

    private static int readInt(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim();
            try { return Integer.parseInt(s); } catch (Exception e) { System.out.print("Enter a valid integer: "); }
        }
    }
    private static double readDouble(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim();
            try { return Double.parseDouble(s); } catch (Exception e) { System.out.print("Enter a valid number: "); }
        }
    }
    private static String readNonEmpty(Scanner sc, String def) {
        String s = sc.nextLine().trim();
        return s.isEmpty() ? def : s;
    }
}

