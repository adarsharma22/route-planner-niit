package route;

public class FlightDetails {
     String source;
     String destination;
    String flightNo;
     String time;
     String price;

    public FlightDetails(String source, String destination, String flightNo, String time, String price) {
        this.source = source;
        this.destination = destination;
        this.flightNo = flightNo;
        this.time = time;
        this.price = price;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }



    @Override
    public String toString() {

        return source +"\t\t\t\t\t\t"+ destination +"\t\t\t\t\t\t\t"+ flightNo+"\t\t\t\t\t\t\t" + time+"\t\t\t\t\t\t" + price+"\t\t\t\t\t";
    }
}