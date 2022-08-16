package Cars;

public class Dimensions {
    public int high;
    public int width;

    public int tankCapacity;

    public Dimensions(int high, int width, int tankCapacity) {
        this.high = high;
        this.width = width;
        this.tankCapacity = tankCapacity;
    }

    public int getTankCapacity() {
        return this.tankCapacity;
    }
}