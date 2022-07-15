//package bus;

import java.util.ArrayList;
import java.util.List;

public class BusOperations {
    
    List<Bus> busList = new ArrayList<>();
    
    public void addBus (String busNumber, String operatorName, String source, String destination, int fare, int seats) {
        Bus bus = new Bus(busNumber, operatorName, source, destination, fare, seats);
        busList.add(bus);
    }

    public List<Bus> searchBus (String source, String destination) {
        List<Bus> result = new ArrayList<>();
        for(Bus bus : busList) {
            if(source.equalsIgnoreCase(bus.getSource()) && destination.equalsIgnoreCase(bus.getDestination()))
                result.add(bus);
        }
        return result;
    }
    public void updateBus(String busNumber, int numberOfBooking) {
        boolean flag = false;
        for (Bus bus : busList) {
            if(bus.getBusNumber().equals((busNumber))) {
                flag = true;
                int seatsAvailable = bus.getSeats();
                if(seatsAvailable - numberOfBooking < 0) {
                    System.out.println("Less number of seats are available");
                    return;
                } else {
                    System.out.println("Booking successful. Fair amount = " + (numberOfBooking*bus.getFare()));
                    System.out.println();
                    bus.setSeats(seatsAvailable - numberOfBooking);
                }
            }
        }
        if (!flag)
            System.out.println("Invalid bus number");
    }
}