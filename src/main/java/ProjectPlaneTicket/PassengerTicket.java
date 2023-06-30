package ProjectPlaneTicket;

public class PassengerTicket {

  //Create a random ID for each passengerTicket
  String passengerName;
  String passengerLastName;
  String passengerAge;
  String routeType;
  String flightDestination;
  String returnDestination;
  String destinationDate;
  String returnDate;
  String classType;

  public PassengerTicket(String passengerName, String passengerLastName, String passengerAge, String routeType, String flightDestination, String returnDestination, String destinationDate, String returnDate, String classType) {
    this.passengerName = passengerName;
    this.passengerLastName = passengerLastName;
    this.passengerAge = passengerAge;
    this.routeType = routeType;
    this.flightDestination = flightDestination;
    this.returnDestination = returnDestination;
    this.destinationDate = destinationDate;
    this.returnDate = returnDate;
    this.classType = classType;
  }
}
