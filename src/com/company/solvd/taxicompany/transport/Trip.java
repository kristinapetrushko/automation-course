public class Trip {

    private String from;
    private String to;
    private String  distance;
    private double price;

    public Trip(String from, String to, String distance, double price) {
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.price = price;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String  getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Trip() {
    }

    public double CalculatePrice() {
        double result, rateperkm;
        rateperkm = 30;
        result = (Double.parseDouble(this.getDistance()) * rateperkm);
        Math.floor(result);
        return result;
    }


}
