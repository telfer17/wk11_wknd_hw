import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departure;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departure, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

    public int getNumberOfPassengers(){
        return this.passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void addPassenger(Passenger passenger){
        if(getNumberOfPassengers() < plane.getCapacity()){
            this.passengers.add(passenger);
        }
    }

    public int getRemainingSeats(){
        return plane.getCapacity() - getNumberOfPassengers();
    }


}
