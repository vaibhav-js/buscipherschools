//package bus;

public class Bus {
    private String busNumber;
    private String operatorName;
    private String source;
    private String destination;
    private int fare;

    private int seats;

    public Bus(String busNumber, String operatorName, String source, String destination, int fare, int seats) {
        this.busNumber = busNumber;
        this.operatorName = operatorName;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
        this.seats = seats;
    }

    public Bus() {}

    public String getBusNumber() {
        return this.busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getOperatorName() {
        return this.operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFare() {
        return this.fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "busNumber='" + busNumber + '\'' +
                ", operatorName='" + operatorName + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", fare=" + fare +
                ", seats=" + seats +
                '}';
    }
}