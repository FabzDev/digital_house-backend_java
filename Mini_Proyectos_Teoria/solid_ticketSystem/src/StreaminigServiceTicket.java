public class StreaminigServiceTicket implements Saleable{
    public String suscriptionName;
    public Integer months;
    public Double pricePerMonth;

    public StreaminigServiceTicket(String suscriptionName, Integer months, Double pricePerMonth) {
        this.suscriptionName = suscriptionName;
        this.months = months;
        this.pricePerMonth = pricePerMonth;
    }

    @Override
    public Double calculateTotal() {
        return pricePerMonth * months;
    }
}
