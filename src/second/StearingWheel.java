package second;

public class StearingWheel {
    private int RadiusOfWheel;
    private String Material;

    public StearingWheel(int radiusOfWheel, String material) {
        RadiusOfWheel = radiusOfWheel;
        Material = material;
    }

    public int getRadiusOfWheel() {
        return RadiusOfWheel;
    }

    public void setRadiusOfWheel(int radiusOfWheel) {
        RadiusOfWheel = radiusOfWheel;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    @Override
    public String toString() {
        return "StearingWheel{" +
                "RadiusOfWheel=" + RadiusOfWheel +
                ", Material='" + Material + '\'' +
                '}';
    }
}
