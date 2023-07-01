package hwrk.skypro;

public class Bycicle extends WheeledTransport {

    public Bycicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}