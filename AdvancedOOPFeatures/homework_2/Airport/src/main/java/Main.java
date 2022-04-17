import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        Airport airport = Airport.getInstance();

        List<Flight> flights =  findPlanesLeavingInTheNextTwoHours(airport);
        flights.forEach(System.out::println);

    }

    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {

        LocalDateTime now = LocalDateTime.now(ZoneId.systemDefault());

        List<Terminal> terminalList =  airport.getTerminals();
        List<Flight> flights = new ArrayList<>();

        terminalList.forEach(terminal -> flights.addAll(terminal.getFlights()));

        return   flights.stream()
                    .filter(flight -> flight.getType() == Flight.Type.DEPARTURE)
                    .filter(flight -> (flight
                    .getDate()
                            .toInstant()
                            .atZone(ZoneId.systemDefault())
                            .toLocalDateTime()
                            .isAfter(now)))
                    .filter(flight -> (flight
                            .getDate()
                            .toInstant()
                            .atZone(ZoneId.systemDefault())
                            .toLocalDateTime()
                            .minus(2,ChronoUnit.HOURS)
                            .isBefore(now)))
                    .collect(Collectors.toList());




    }

}