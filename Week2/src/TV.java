// this is an example of a real-world thing being represented inside
// a Java program
public class TV {
    private int voltage;
    private boolean switchedOn;
    private Port[] inputs;

    public TV() {
        voltage = 100000;
        switchedOn = false;
        inputs = new Port[] { new Port(), new Port(), new Port()};
    }

    @Override
    public String toString() {
        return "TV(" + voltage + "V)";
    }
}
