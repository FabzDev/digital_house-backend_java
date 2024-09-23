public class Location {
    private Double longitude;
    private Double latitude;

    public Location(Double longitude, Double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Double calculateDistance(Location newLocation){
        Double difLat = Math.pow(this.longitude - newLocation.longitude, 2);
        Double difLon = Math.pow(this.latitude - newLocation.latitude, 2);
        return Math.sqrt(difLat + difLon);
    }
}
