package Cars;

public class Car {
    public Producent producent;
    public boolean isAutomaticGear;
    public Market market;
    public String segment;

    public Dimensions dimensions;

    public Car(Producent producent, boolean isAutomaticGear, Market Market, String segment, Dimensions Dimensions) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = Market;
        this.segment = segment;
        this.dimensions = Dimensions;
    }
}